package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee implements TaxPayer {
    private String name;
    private LocalDate localDate;

    public Employee() {

    }

    public Employee(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    public String getEmployeeInfo(){
        return "name = " + name + " hireDate = " + localDate;
    }

    public String work(){
       return getName() + " worked.";
    }

    double computeMonthlyCompensation(){
        return 0.0;
    }


// setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getLocalDate(), employee.getLocalDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocalDate());
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return 0;
    }
}
