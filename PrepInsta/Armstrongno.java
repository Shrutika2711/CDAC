package org.Prepinsta;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,org,result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		org = n;
		while(org != 0) {
			r = org % 10;
			result += Math.pow(r , 3);
			org /= 10;
		}
		if(result == n) {
			System.out.println(n + " is Armstrong number.");
		} else {
			System.out.println(n + " is not Armstrong number.");
		}
    }

}


