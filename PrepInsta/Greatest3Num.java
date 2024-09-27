package org.Prepinsta;

public class Greatest3Num {

	public static void main(String[] args) {
		int a = 8, b = 12, c = 11;
		if(a > b && a > c) {
			System.out.println(a + " is greatest");
		}
		else if (b > a && b > c) {
			System.out.println(b + " is greatest");
		}
		else {
			System.out.println(c + " is greatest");
		}

	}

}
