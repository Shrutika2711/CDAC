package Cdac_Assignment2_Practice;

import java.util.Scanner;

public class Days_of_the_Week {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number for days ");
	        int num = scanner.nextInt();
	        
	        switch (num) {
	            case 1:
	                System.out.println("Monday");
	               
	                switch (num) {
	                    case 1:
	                        System.out.println("It's a weekday.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                switch (num) {	                    
	                    case 2:
	                         System.out.println("It's a weekday.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                switch (num) {
	                    case 3:
	                        System.out.println("It's a weekday.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            case 4:
	                System.out.println("Thursday");
	                switch (num) {
	                    case 4:
	                        System.out.println("It's a weekday.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            case 5:
	                System.out.println("Friday");
	                switch (num) {	                    
	                    case 5:
	                        System.out.println("It's a weekday.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            case 6:
	                System.out.println("Saturday");
	                switch (num) {
	                    case 6:
	                        System.out.println("It's the weekend.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            case 7:
	                System.out.println("Sunday");
	                switch (num) {
	                    case 7:
	                        System.out.println("It's the weekend.");
	                        break;
	                    default:
	                        break;
	                }
	                break;
	            default:
	                System.out.println("Invalid input! Please enter a number between 1 and 7.");
	        }
	}

}
