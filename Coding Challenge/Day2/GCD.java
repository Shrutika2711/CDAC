package org.Day2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();
        
        while(a != b) {
        	if(a > b) {
        		a -= b;
        	} else {
				b -= a;
			}
			}
        
        System.out.println("The GCD of " + b);
	}
	
}
