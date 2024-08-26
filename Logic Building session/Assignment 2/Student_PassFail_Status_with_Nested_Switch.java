package Cdac_Assignment2_Practice;

import java.util.Scanner;

public class Student_PassFail_Status_with_Nested_Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Subject 1: ");
		int sub1 = scanner.nextInt();
		System.out.println("Enter the Subject 2: ");
		int sub2 = scanner.nextInt();
		System.out.println("Enter the Subject 3: ");
		int sub3 = scanner.nextInt();
		
		int failsub = 0;
		if(sub1 <= 40) {
			failsub ++;
		}
		if(sub2 <= 40) {
			failsub ++;
		}
		if(sub3 <= 40) {
			failsub ++;
		}
		
		if(failsub == 0) {
			System.out.println("Student Passes!");
		}else {
			System.out.println("Student fails in " + failsub + " subjets.");
		}
		

	}

}
