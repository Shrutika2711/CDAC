package CDAC_Assi3;
//Fibonacci sequence up to the number 21
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21, f = 0, s = 1;
		System.out.println("Fibonacci Series: "+n);
		while(f <= n) {
			System.out.print(f+ ", ");
			int next = f + s;
			f = s;
			s = next;
		}
		

	}

}
