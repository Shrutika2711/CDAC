package com.assignment5;

import java.util.Scanner;

public class EmpProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while(running) {
			System.out.println("choose from the following :");
			System.out.println("1. Add Employee :");
			System.out.println("2. Apply Raise :");
			System.out.println("3. Update employee Salary :");
			System.out.println("4. Display total Employee :");
			System.out.println("5. Display total salary Expense :");
			System.out.println("6. Display all Employees");
			System.out.println("7. Exit :");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1 :
					System.out.println("Enter employee ID: ");
					int id = sc.nextInt();
					System.out.println("Enter employee name: ");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.println("Enter employee Salary :");
					double salary = sc.nextDouble();
					new Employee(id , name , salary);
					System.out.println("Employee added successfully.");
					break;
				case 2:
					System.out.print("Enter raise percentage: ");
					double percentage = sc.nextDouble();
					Employee.applyRaise(percentage);
					System.out.println("Raise applied to all employees.");
					 break;

				case 3:
					 System.out.print("Enter employee ID to update salary: ");
					 int empId = sc.nextInt();
					 sc.nextLine();
					 boolean found = false;
					 for (Employee emp : employeeList) {
						 if (emp.getId() == empId) {
							 System.out.print("Enter new salary: ");
							 double newSalary = sc.nextDouble();
							 emp.updateSalary(newSalary);
							 System.out.println("Salary updated.");
							 found = true;
							 break;
						 }
					 }
					 if (!found) {
						 System.out.println("Employee not found.");
					 }
					 break;
				case 4:
					 System.out.println("Total number of employees: " +
					 Employee.getTotalEmployee());
					 break;

				case 5:
					 System.out.println("Total salary expense: " +
					 Employee.calculateTotalSalaryExpense());
					 break;
				case 6:
					 System.out.println("Employee List:");
					 for (Employee emp : employeeList) {
					 System.out.println(emp);
					 }
					 break;

				case 7:
					 running = false;
					 System.out.println("Exiting program.");
					 break;

				default:
					 System.out.println("Invalid choice. Please try again.");
				}
			}
			sc.close();
	}
}
