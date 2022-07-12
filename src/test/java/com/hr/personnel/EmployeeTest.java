package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {
    private  Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new HourlyEmployee("Riddick", LocalDate.of(2020, 12, 20), 40, 45);
    }

    @org.junit.Test
    public void getEmployeeInfoShouldReturnName_and_HireDate() {
        employee = new SalariedEmployee("Riddick", LocalDate.of(2020, 12, 20), 10000);
        String employeeInfo = employee.getEmployeeInfo();
        assertEquals("name = Riddick hireDate = 2020-12-20", employeeInfo);
    }

    @org.junit.Test
    public void work_shouldReturn_Plus_worked_string() {
        Employee employee = new SalariedEmployee("Riddick", LocalDate.of(2020,12,20), 10000);
        String work = employee.work();

        Assert.assertEquals("Riddick worked.", work);
    }
}