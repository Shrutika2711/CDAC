import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        int org = num;
        int r = 0;
        while (num > 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }
        return org == r;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " true");
        } else {
            System.out.println(number + " false");
        }
        
        sc.close();
    }
}
