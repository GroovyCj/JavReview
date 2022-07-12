package com.hr.personnel;
import com.hr.personnel.Employee;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private String location;

    private int currentIndex = 0;

    Employee[] employees =  new Employee[100];


    public Department(){

    }


    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;


    }

   public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        int employeesWhoWorked = 0;
        for (int i = 0; i < currentIndex; i++){
            String work = employees[i].work();
            if(work.contains("worked")){
                employeesWhoWorked++;

            }
        }
        return employeesWhoWorked;
    }
    double computeDepartmentMonthlyTotalCompensation(){
        double sum = 0;
        for (int i = 0; i < currentIndex; i++){
            sum += employees[i].computeMonthlyCompensation();
        }
        return sum;

    }


    // setters and getters

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

}
