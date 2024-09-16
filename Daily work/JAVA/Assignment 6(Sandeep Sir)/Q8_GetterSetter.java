package com.assignment6;

import java.util.Scanner;

public class Q8_GetterSetter {
	private int[] num;
	
	public Q8_GetterSetter(int size) {
		num = new int[size];
	}
	
	public void setNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + num.length + "numbers: ");
		for(int i =0; i < num.length ; i++ ) {
			System.out.println("Enter number for index " + i + ": ");
			num[i] = sc.nextInt();
		}
	}

	public void getNum() {
		System.out.println("The elements of the array are: ");
		for(int i =0; i <num.length; i++) {
			System.out.println("Index " + i + ":" + num[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8_GetterSetter gs = new Q8_GetterSetter(4);
		gs.setNum();
		gs.getNum();
	}

}
