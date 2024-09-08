package Assignment_2;

import java.util.Scanner;

public class Q10_ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr 1st no.: ");
		int n1 = s.nextInt();
		
		System.out.println("Enetr 2nd no.: ");
		int n2 = s.nextInt();
		
		System.out.println("Enetr arithmetic opeator((+, -, *, /): ");
		char a = s.next().charAt(0);
		
		switch (a) {
			case '+':
			result = n1 + n2;
			break;
			
			case '-':
			result = n1 - n2;
			break;
			
			case '*':
			result = n1 * n2;
			break;
			
			case '/':
				result = n1 / n2;
				break;
			default:
				System.out.println("Invalid operator: ");
				break;
		}
		System.out.printf("Result: %.2f%n", result);
		s.close();
	}

}
