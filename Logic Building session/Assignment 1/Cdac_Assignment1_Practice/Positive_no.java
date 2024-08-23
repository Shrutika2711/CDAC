package Cdac_Assignment1_Practice;

import java.util.Scanner;

public class Positive_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 25;
//		if(n > 0) {
//			System.out.println("Number is positive");
//		}
//		else {
//			System.out.println("Number is negative");
//		}
		
		Scanner sc = new Scanner(System.in);
        System.out.print("");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(num+" is zero");
        } else if (num % 2 == 0) {
            System.out.println(num+" is even");
        } else {
            System.out.println(num+" is odd");
        }
     
        
	}
}

