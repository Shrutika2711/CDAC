package com.aSsignment3;

import java.util.Scanner;

public class Q3_BMI {
	private double w;
	private double h;
	private double bmi;
	private String op;
	
	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        w = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        h = scanner.nextDouble();

        scanner.close();
	}
	 public void calculateBMI() {
	        bmi = w / (h * h);  
	 }
	 
	 public void BMI() {
	        if (bmi < 18.5) {
	            op = "Underweight";
	        } else if (bmi >= 18.5 && bmi < 24.9) {
	            op = "Normal weight";
	        } else if (bmi >= 25 && bmi < 29.9) {
	            op = "Overweight";
	        } else {
	            op = "Obese";
	        }
	    }
	 public void printRecord() {
	        System.out.printf("Your BMI is: %.2f%n", bmi);
	        System.out.println("BMI Classification: " + op);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3_BMI tracker = new Q3_BMI();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.BMI();
        tracker.printRecord();
	        
	    

	}

}
