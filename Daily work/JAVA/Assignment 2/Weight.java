package Assignment1;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		double w = s.nextDouble();
		
		System.out.println("Enter your height in meter: ");
		double h = s.nextDouble();
		
		String category;
		double bmi = w / (h * h);
		if(bmi < 18.5) {
			category = "Unterweight";
		}
		else if (bmi >= 18.2 && bmi < 24.9) {
			category = "Normal weight";
		}
		else if(bmi >= 25 && bmi <29.9) {
			category = "Overweight";
		}
		else {
			category = "Obese";
		}
		
		 System.out.printf("Your BMI is: %.2f\n", bmi);
	     System.out.println("You are classified as: " + category);
	}

}
