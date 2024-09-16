package com.assignment6;

import java.util.Scanner;

public class Q7 {
	
	private int[] arr;
	
	public Q7(int size) {
		arr = new int[size];
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + arr.length + "elements: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Element " +i + ": ");
			arr[i] = sc.nextInt();
		}
	}
	public void printRecord() {
		System.out.println("The elements of the array are: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(" " + i + " : " + arr[i]);
		}
	}
	public static void main(String[] args) {
		Q7 a = new Q7(4);
		a.acceptRecord();
		a.printRecord();
	}

}
