package org.Prepinsta;

import java.util.Scanner;

public class FibonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1;
	    int c;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter number: ");
	    c = s.nextInt();
	    //System.out.println();
	    int nextTerm;
	    for(int i = 2; i < c; i++){
	        nextTerm = n1 + n2;
	        n1 = n2;
	        n2 = nextTerm;
	        System.out.print(nextTerm + "  ");

	    }
	    s.close();
	}

}
