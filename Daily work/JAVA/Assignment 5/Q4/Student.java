package org.Assig5_Student;

public class Student {
	String name;
	String rollN;
	String course;
	
	public Student (String name, String rollN, String corse) {
		this.name = name;
		this.rollN = rollN;
		this.course = course;
	}
	public void printRecord() {
		System.out.println("Student Details: ");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollN);
		System.out.println("Course: " + course);
	}
	
}
