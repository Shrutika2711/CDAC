package org.Prepinsta;

import java.util.Scanner;

public class OctaltoDecimal {
	public static void main(String args[]){      
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a octal number : ");
		int o = sc.nextInt();
		int decimal = 0;		
		int n = 0; 
		while(o > 0){
			int temp = o % 10;  
			decimal += temp * Math.pow(8, n);  
			o = o / 10;  
			n++;  
		}
		System.out.println("Decimal : "+decimal);
		sc.close();   
	}

}
