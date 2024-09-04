package Assignment1;

import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Select a shape ");
		System.out.println("1. Circle\t 2.Square\t 3.Rectangle\t 4.Triangle ");
		System.out.println("Enter your choice (1-4): ");
		int choice = s.nextInt();
		double area = 0;
		switch(choice) {
		case 1:
			System.out.println("Enter the radius: ");
			double r = s.nextDouble();
			area = 3.14 * r * r;
			break;
		case 2:
			System.out.println("Enter the length: ");
			double l = s.nextDouble();
			area = l * l;
			break;
		case 3:
			System.out.println("Enter the length: ");
			double l1 = s.nextDouble();
			System.out.println("Enter the width: ");
			double w = s.nextDouble();
			area = l1 * w;
			break;
		case 4:
			System.out.println("Enter the base: ");
			double b = s.nextDouble();
			System.out.println("Enter the height: ");
			double h = s.nextDouble();
			area = 0.5 * b * h;
			break;
		default:
            System.out.println("Invalid choice.");
            System.exit(0);
		}
		System.out.println("Area is : " + area);
	}

}
