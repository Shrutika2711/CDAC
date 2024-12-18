package org.Prepinsta;

public class PerfectSquare {
	static boolean isPerfectSquare(int x) {
		if(x >= 0) {
			int sr = (int)Math.sqrt(x);
			return ((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args) {
		int x = 64;
		if(isPerfectSquare(x)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
