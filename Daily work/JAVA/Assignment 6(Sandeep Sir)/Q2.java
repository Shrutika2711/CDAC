package com.assignment6;

import java.util.Scanner;

public class Q2 {
	private static void acceptRecord(int[] arr) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   
        }
		
	}
	private static void printRecord(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Array elements are:");

        for (int i : arr) {
            System.out.println(i);  
        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
        acceptRecord(arr);
        printRecord(arr);

	}

}
