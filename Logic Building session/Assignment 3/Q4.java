package CDAC_Assi3;
//Write a program to reverse the digits of the number 1234. The output should be 4321.
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		int r = 0;
		while (n != 0) {
			int d = n % 10;
		r = r * 10 + d;
		n /= 10;
		}
		System.out.println(" " +r);
	}

}
