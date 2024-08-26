package CDAC_Assi3;
//factorial of the number 10.
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
        long f = 1;
        for(int i = 1; i <= num; ++i) {
            f *= i;
        }
        System.out.printf("Factorial of %d = %d", num, f);
	}

}
