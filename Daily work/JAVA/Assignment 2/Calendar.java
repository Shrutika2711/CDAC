package Assignment1;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a month (1-12): ");
		int month = s.nextInt();
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autum";
			break;
		default:
            season = "Please enter a number between 1 and 12.";
            break;
		}
		System.out.println("Season: " + season);
	}

}
