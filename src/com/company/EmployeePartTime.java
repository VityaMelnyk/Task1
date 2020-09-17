package com.company;

import java.util.stream.Stream;

public class EmployeePartTime implements IAccounting{
    private String name;
    private double rate;
    private int hours;

    public EmployeePartTime() {
    }

    public EmployeePartTime(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "EmployeePartTime{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    @Override
    public double getMounthSalary() {
        return this.getHours()*this.getRate();
    }
}