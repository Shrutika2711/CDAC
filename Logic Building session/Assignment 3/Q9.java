package CDAC_Assi3;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4825;
		int l = 0;
		while (n > 0) {
			int n1 = n % 10;
			if( n1 > l) {
				l = n1;
			}
			n /= 10;
		}
		System.out.println("Largest number: " +l);
	}

}
