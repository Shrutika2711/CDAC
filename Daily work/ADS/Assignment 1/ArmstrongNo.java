import java.util.Scanner;

public class ArmstrongNo {
		public static int cal(int num , int power){
			if(num == 0){
				return 0;
			}
			int digit = num % 10;
			return (int) Math.pow(digit, power) + cal(num / 10, power);
		}
		public static int count(int num){
			if(num == 0){
				return 0;
			}
			return 1 + count(num / 10);
		}
		public static boolean isArmstrong(int num){
			int numDigit = count(num);
			int sum = cal(num, numDigit);
			return num == sum;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		if(isArmstrong(num)) {
		System.out.println(num + " true");
		} else {
		System.out.println(num + " false");
		}
		sc.close();
    }

}

