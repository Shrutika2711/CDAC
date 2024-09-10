package com.assignment7;

import java.util.Scanner;
public class Q3_MinMaxValue {
		    
	public static void acceptRecord(int[] arr) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter " + arr.length + " integers:");

	     for (int i = 0; i < arr.length; i++) {
	          arr[i] = sc.nextInt();  
	        }
	    }

	    public static int findMax(int[] arr) {
	        int max = arr[0]; 
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];  
	            }
	        }
	        return max;
	    }
	    public static int findMin(int[] arr) {
	        int min = arr[0]; 
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];  
	            }
	        }
	        return min;
	    }
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        int[] arr = new int[5]; 
	        acceptRecord(arr);
	        int max = findMax(arr);
	        int min = findMin(arr);

	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }

}
