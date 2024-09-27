package org.Prepinsta;

public class SumofNNumbers {
	static int getSum(int n) {
		if(n == 0) {
			return n + getSum(n-1);
		}
		return n;
		
	}
	public static void main(String[] args) {
		int n = 10;
	    int sum = getSum (n);
	    System.out.println (sum);
	}

}
