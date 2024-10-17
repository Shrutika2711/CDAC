package org.Prepinsta;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();
        int g = 0;
        for(int i = 1; i <= a || i <= b; i++) {
        	if(a % i == 0 && b % i == 0) {
        		g = i;
        	}
        }
        System.out.println("The GCD : " + g);
	}

}
