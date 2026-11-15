package com.practice.employee;

public class Employee {

	
	private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void updateEmployeeName(String newName) {
        this.name = newName;
    }
    
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Employee details displayed");
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
