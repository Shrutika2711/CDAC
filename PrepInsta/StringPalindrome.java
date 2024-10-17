package org.Prepinsta;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = s.nextLine();
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
            if(str.equals(rev)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            s.close();
    }

}
