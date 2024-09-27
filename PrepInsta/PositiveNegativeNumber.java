package org.Prepinsta;

import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = s.nextInt();
		if(a == 0) {
			System.out.println("Number is zero");
		}else if (a > 0) {
			System.out.println("Positive Number");
		}else {
			System.out.println("Negative number");
		}
	}
}
