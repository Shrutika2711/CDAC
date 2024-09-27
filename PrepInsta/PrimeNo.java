package org.Prepinsta;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Number: ");
		int a = s.nextInt();
		if(a % 2 == 0 ) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not prime number");
		}

	}

}
