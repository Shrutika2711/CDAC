package com.assignment4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
		LoanAmortizationCalculator calculator = null;
		boolean b = true;
		while(b) {
			System.out.println("1.Enter loan details: ");
			System.out.println("2. Exit");
			System.out.print("Choose an option: ");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
			calculator = LoanAmortizationCalculatorUtil.acceptRecord();
			LoanAmortizationCalculatorUtil.printRecord(calculator);
			break;
			}
			case 2:
			b = false;
			System.out.println("Exit");
			break;
			default:
			System.out.println("Invalid option choose again.");
			}
		}

	}

}
