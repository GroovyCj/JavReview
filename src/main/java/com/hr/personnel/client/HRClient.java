package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Riddick", LocalDate.of(2020, 03, 20), 40, 45);
        SalariedEmployee employee2 = new SalariedEmployee("Maeve", LocalDate.of(1999, 9, 9), 10_000);
        Employee employee3 = new SalariedEmployee("Homelander", LocalDate.of(2010, 7, 4), 50_000);
        System.out.println(employee1.getEmployeeInfo());
        employee2.getEmployeeInfo();
        employee3.getEmployeeInfo();

        Department dep = new Department("engineering", "building1");
        dep.addEmployee(employee1);
        dep.addEmployee(employee2);
        dep.addEmployee(employee3);

    }
}

