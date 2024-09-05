package Coding_challenge;

public class Day1_Q1_hollowpyramid {

	public static void main(String[] args) {
		
		int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = r; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i-1); j++) {            
                if (j == 1 || j == (2*i-1) || i == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
         System.out.println();
        }

	}

}
