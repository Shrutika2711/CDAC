package org.Prepinsta;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = s.nextLine();
        String st = "";
        for(int i = str.length() - 1; i >= 0; i--){
            st += str.charAt(i);
        }
        System.out.println(st);
        s.close();

    }

}
