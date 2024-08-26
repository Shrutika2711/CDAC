package Cdac_Assignment2_Practice;

import java.util.Scanner;

public class Discount_Calculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: ");
        double total = scanner.nextDouble();

        double discount;
        double finalAmount;
        if (total >= 1000) {
            discount = total * 0.20;
        } else if (total >= 500) {
            discount = total * 0.10;
        } else {
            discount = total * 0.05;
        }
        finalAmount = total - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount after Discount: " + finalAmount);

	}

}
