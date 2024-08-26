package Cdac_Assignment1_Practice;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 27, b = 11, c = 99;
		int l;
		if (a >= b && a >= c) {
            l = a;
        } else if (b >= a && b >= c) {
            l = b;
        } else {
            l = c;
        }
		System.out.println("The largest number is: " + l);
	}

}
