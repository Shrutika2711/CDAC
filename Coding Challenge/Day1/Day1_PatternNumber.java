package Coding_challenge;

public class Day1_PatternNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i; j++) {
	                System.out.print(" ");
	            }
	            	for (int k = 0; k <= i; k++) {
	            		System.out.print(k + 1);
	            	}
	            		for (int l = i - 1; l >= 0; l--) {
	            			System.out.print(l + 1);
	            		}
	            System.out.println();
	        }
	}

}
