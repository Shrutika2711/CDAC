package org.Prepinsta;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		int b = s.nextInt();
		int d = 0;
		int n = 0;
		while(b > 0) {
			int temp = b % 10;
			d += temp * Math.pow(2, n);
			b /= 10;
			n++;
		}
		System.out.println("Decimal number is: " + d);
		s.close();
	}

}
