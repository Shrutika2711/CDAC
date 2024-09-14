package com.assignment6;

import java.util.ArrayList;

public class Q5_Intersection {
	public static int[] find(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		for( int i = 0; i< arr1.length; i++) {
			for(int j = 0; j <arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					
					if(!list.contains(arr1[i])) {
						list.add(arr1[i]);
					}
					break;
				}
			}
		}
		int[] arr = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,5,1,6};
		int[] intersection = find(arr1, arr2);
		System.out.println("Intersection of the two arrays: ");
		for(int num : intersection) {
			System.out.println(num + " ");
		}
		
	}

}
