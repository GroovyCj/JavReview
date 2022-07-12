package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private int hoursWorked;
    double hourlyRate;

    // Ctors
    public HourlyEmployee (){

    }

    public HourlyEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public HourlyEmployee(String name, LocalDate localDate, int hoursWorked, double hourlyRate) {
        super(name, localDate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }




    // getters and setters
    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public double computeMonthlyCompensation(){
        return getHourlyRate() * getHoursWorked();
    }

    @Override
    public double computeMonthlyTaxToPay() {
        double rate = getHourlyRate() * getHoursWorked();
        return rate * hourlyTaxRate;
    }
}
