package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double monthlySalary;


    public SalariedEmployee(){

    }
    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
        super(name, localDate);
        this.monthlySalary = monthlySalary;
    }



    double computeMonthlyCompensation(){
        return getMonthlySalary();
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return salaryTaxRate * getMonthlySalary();
    }
}
