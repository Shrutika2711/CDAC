package CDAC_Assi3;
public class Q6 {

	public static void main(String[] args) {
				
		int count = 0;
        int n = 2; 

        while (count < 5) {
            int c1 = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c1++;
                }
            }
            if (c1 == 2) { 
                System.out.println(n);
                count++;
            }
            n++;
        }
	}
}
