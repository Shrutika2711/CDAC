package com.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_DuplicateElement {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i = 0; i< n; i++) {
			int a = sc.nextInt();
			if (a <= n) {
				arr[i] = a;
			}
			else {
				System.out.println(" Enter a number between 1 & " +n);
				i--;
				
			}
		}
		Arrays.sort(arr);
		for(int i = 1; i <= n; i++) {
			int flag = 0;
			for(int j = 0; j < n; j++) {
				if(arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(i);
			}
		}

	}

}
