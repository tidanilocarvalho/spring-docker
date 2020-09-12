package com.danilo.springboot.docker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danilo.springboot.docker.entity.Age;
import com.danilo.springboot.docker.service.CalcAge;

@RestController("/cal")
public class CalcController {

    @Autowired(required = false)
    private Optional<CalcAge> calcAge;
    
	@GetMapping(path = "/age")
	public ResponseEntity<Age> calcAge(@RequestParam(name = "birthDate", required = true) String birthDate) {
	    HttpHeaders headers = new HttpHeaders();

	    if (calcAge.isPresent())
        {
	        Age age = calcAge.get().calc(LocalDate.parse(birthDate, DateTimeFormatter.ISO_DATE));
	        
	        headers.add("Custom-Header-birthDate", age.toString());
	        
	        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .body(age);
        } else {
            headers.add("Custom-Header", "There is no impl for called interface");
            
            return ResponseEntity
                    .notFound()
                    .headers(headers)
                    .build();
        }
	    
	}

}
