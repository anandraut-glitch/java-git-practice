package com.practice.employee;

public class Main {

    public static void main(String[] args) {

        Employee employee =
                new Employee(101, "Anand", 50000);

        employee.displayEmployee();

        employee.updateEmployeeName("Rahul");

        System.out.println("After updating:");

        employee.displayEmployee();
    }
}