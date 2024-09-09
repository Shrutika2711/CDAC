package com.aSsignment3;

import java.util.Scanner;

public class Q4_RetailSales {
	private double originalPrice;
	private double discountRate;
	private double discountAmount ;
	private double finalPrice;
	
	public void acceptRecord() {
		Scanner s = new Scanner(System.in);
		System.out.println("Original price:");
		this.originalPrice = s.nextDouble();
		System.out.println("Discount rate: ");
		this.discountAmount = s.nextDouble();
		s.close();
	}
	
	public void calculate() {
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
	}
	public void printRecord() {
		System.out.printf("Discount amount: %.2f%n", discountAmount);
		System.out.printf("final price: %.2f%n",finalPrice);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4_RetailSales r = new Q4_RetailSales();
		r.acceptRecord();
		r.calculate();
		r.printRecord();
	}

}
