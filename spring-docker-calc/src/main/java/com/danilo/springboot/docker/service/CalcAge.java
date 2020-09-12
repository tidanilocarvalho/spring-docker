package com.danilo.springboot.docker.service;

import java.time.LocalDate;

import com.danilo.springboot.docker.entity.Age;

public interface CalcAge
{

    Age calc(LocalDate localDate);
    
}
