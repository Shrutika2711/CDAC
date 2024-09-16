package com.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private static int totalEmployee = 0;
	private static double totalSalary = 0;
	private static List<Employee> employeeList = new ArrayList<>();
	private int id;
	private String name;
	private double salary;
	static {
		System.out.println("Employee Management");
	}
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		totalEmployee++;
		totalSalary = totalSalary+salary;
		employeeList.add(this);
	}
	public static int getTotalEmployee() {
		return totalEmployee;
	}
	public static void applyRaise(double percentage) {
		for(Employee emp : employeeList) {
			double raiseAmount=emp.salary*(percentage/100);
			emp.salary += raiseAmount;
		}
	calculateTotalSalaryExpense(); 
	 }
	static double calculateTotalSalaryExpense() {
	totalSalary = 0;
	for (Employee emp : employeeList) {
		totalSalary += emp.salary;
	}
	return totalSalary;
	}
	public void updateSalary(double newSalary) {
		 totalSalary -= this.salary; 
		 this.salary = newSalary;
		 totalSalary += this.salary; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}		
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ID =" +id + ", Name = " +name +", Salary = "+salary+" ]";
	}


}
