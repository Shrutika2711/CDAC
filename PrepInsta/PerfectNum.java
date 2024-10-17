package org.Prepinsta;

public class PerfectNum {

	public static void main(String[] args) {
		int n = 28, sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not perfect number");
		}

	}

}
