import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		int r,org,result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		org = n;
		while(org != 0) {
			r = org % 10;
			result += Math.pow(r , 3);
			org /= 10;
		}
		if(result == n) {
			System.out.println(n + " true");
		} else {
			System.out.println(n + " false");
		}
    }

}

