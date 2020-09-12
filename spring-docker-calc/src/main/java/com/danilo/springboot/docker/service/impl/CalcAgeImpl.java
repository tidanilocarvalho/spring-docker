package com.danilo.springboot.docker.service.impl;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.danilo.springboot.docker.entity.Age;
import com.danilo.springboot.docker.service.CalcAge;

@Service
public class CalcAgeImpl implements CalcAge
{

    @Override
    public Age calc(LocalDate brithDate)
    {
        Period period = Period.between(brithDate, LocalDate.now());

        return new Age(period.getYears(), period.getMonths(), period.getDays());
    }

}
