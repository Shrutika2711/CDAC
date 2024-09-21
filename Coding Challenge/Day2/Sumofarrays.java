package org.Day2;

import java.util.Scanner;

public class Sumofarrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the array list size: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		
		//int i;
		System.out.println("Enter numbers: ");
		for(int i = 0; i < n; i++ ) {
			arr[i] = s.nextInt();			
		}

		int sum = 0 ;
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		float avg = sum / arr.length;
		System.out.println(" " + avg);
		
		System.out.println("Numbers greater than the average: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);
            }
         }
        s.close();
	}

}
