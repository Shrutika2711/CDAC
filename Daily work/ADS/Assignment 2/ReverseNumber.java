import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = s.nextInt();
        int a, rev = 0;
        while(n != 0){
            a = n % 10;
            rev = rev * 10 + a;
            n /= 10;
        }
        System.out.println(rev);
        s.close();
    }
    
}
