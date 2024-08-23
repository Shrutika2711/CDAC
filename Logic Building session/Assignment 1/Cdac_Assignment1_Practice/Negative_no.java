package Cdac_Assignment1_Practice;

import java.util.Scanner;

public class Negative_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = -5;
//		if(n < 0) {
//			System.out.println("Number is negative");
//		}
//		else {
//			System.out.println("Number is positive");
//		}
		
		
		    
		       
		        Scanner scanner = new Scanner(System.in);
		        double principal = scanner.nextDouble();
		        double annualRate = scanner.nextDouble();
		        double rate = annualRate / 100;
		        int timesCompounded = scanner.nextInt();
		        int years = scanner.nextInt();		       
		        double amount = principal * Math.pow((1 + rate / timesCompounded), (timesCompounded * years))-principal;		        
		        System.out.printf("The amount of money accumulated after %d years is: %.2f%n", years, amount);

		        //scanner.close();
		    

	}

}
