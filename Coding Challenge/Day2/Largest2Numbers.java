package org.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Largest2Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array list size: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		int i;
		System.out.println("Enter numbers: ");
		for(i = 0; i < n; i++ ) {
			arr[i] = s.nextInt();			
		}
		
		Arrays.sort(arr);
		
		int[] rev = new int[n];
		for(i = 0; i < n; i++ ){
			rev[i] = arr[n - i -1];
		}
		System.out.println("Enter the value of k (largest numbers): ");
		int k = s.nextInt();
		System.out.println(k + " largest elements are: ");
			for(i = 0 ; i < k; i++) {
				System.out.println(rev[i] + " ");
			
			
		}
	}

}
