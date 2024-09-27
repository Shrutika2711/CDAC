package org.Prepinsta;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("odd number");
		}
		sc.close();
	}
}
