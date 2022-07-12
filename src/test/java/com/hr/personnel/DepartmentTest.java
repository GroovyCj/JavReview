package com.hr.personnel;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Test
    public void addEmployee_should_add_employee_to_Array() {
        Department department = new Department("marketing", "building2");
        SalariedEmployee jane = new SalariedEmployee("Jane", LocalDate.of(2020, 5, 19), 10000);
        department.addEmployee(jane);
        Employee[] employees = department.getEmployees();
        //assertEquals(jane.getName(), employees[0].getName());
        //assertEquals(jane, employees[0]);
        SalariedEmployee jane1  = new SalariedEmployee("jane", LocalDate.of(2020, 5, 19), 10000);
        assertEquals(jane1, employees[0]);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
    }
}