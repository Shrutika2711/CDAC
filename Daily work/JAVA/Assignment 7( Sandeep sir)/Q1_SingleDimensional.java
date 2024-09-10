package com.assignment7;

import java.util.Scanner;

public class Q1_SingleDimensional {
	public static void acceptRecord(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  
        }
    }
    public static void printRecord(int[] arr) {
        for (int i : arr) {
            System.out.println(i);  
        }
    }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] arr = new int[5];
	        
	        System.out.println("Default values of the array: ");
	        printRecord(arr);
	        acceptRecord(arr);
	        System.out.println("Updated values of the array: ");
	        printRecord(arr);
	    }
}
