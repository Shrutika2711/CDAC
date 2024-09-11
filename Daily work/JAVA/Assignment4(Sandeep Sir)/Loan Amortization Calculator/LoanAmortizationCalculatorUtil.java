package com.assignment4;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	public static LoanAmortizationCalculator acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter principle amount: ");
		double principle = sc.nextDouble();
		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = sc.nextDouble();
		System.out.print("Enter loan term (in years): ");
		int loanTerm = sc.nextInt();
		return new LoanAmortizationCalculator(principle, annualInterestRate,loanTerm);
	}
	
	public static void printRecord(LoanAmortizationCalculator calculator) {
		System.out.println("Loan Details: ");
		System.out.println(calculator);
		double monthlyPayment = calculator.calculateMonthyPayment();
		double totalAmountPaid = calculator.calculateTotalAmountPaid();
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Amount Paid Over the Loan Term: %.2f\n", totalAmountPaid);
	}
}
