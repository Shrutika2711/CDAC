package com.aSsignment3;
import java.util.Scanner;

public class Q1LoanCalculator {

	private double principal;
	private double annualInterestRate;
	private int lterm;
	private double monthlyPayment;
	private double totalPayment;
	
	
	public void Acceptdetails(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the loan amount: ");
		this.principal = s.nextDouble();
		
		System.out.println("enter the annual interest rate: ");
		this.annualInterestRate = s.nextDouble();
		
		System.out.println("Enter loan trem (year): ");
		this.lterm = s.nextInt();
		
		s.close();
		
	}
	public void calculate() {
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		int numberOfMonths = lterm * 12;
		if(monthlyInterestRate > 0 ) {
		monthlyPayment = principal * (monthlyInterestRate * 
				Math.pow(1 + monthlyInterestRate, numberOfMonths)) 
				/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1) ;
		}else {
			monthlyPayment = principal / numberOfMonths;
		}
		totalPayment = monthlyPayment * numberOfMonths;
		
	}
	public void printRecord() {
		       
        System.out.printf("Monthly Payment: %.2f%n" , monthlyPayment);
        System.out.printf("Total Amount Paid over the loan term:  %.2f%n" , totalPayment);
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1LoanCalculator c = new Q1LoanCalculator();
		c.Acceptdetails();
		c.calculate();
		c.printRecord();
	}

}
