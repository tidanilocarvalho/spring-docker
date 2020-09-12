package com.danilo.springboot.docker.entity;

public class Age
{
    private int years;
    private int months;
    private int days;

    public Age(int years, int months, int days)
    {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public int getDays()
    {
        return this.days;
    }

    public int getMonths()
    {
        return this.months;
    }

    public int getYears()
    {
        return this.years;
    }

    @Override
    public String toString()
    {
        return years + " Years, " + months + " Months, " + days + " Days";
    }
}
