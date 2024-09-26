import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("a =  ");
        int a = s.nextInt();
        System.out.println("b =  ");
        int b = s.nextInt();
        
        while(a != b) {
        	if(a > b) {
        		a -= b;
        	} else {
				b -= a;
			}
			}
        
        System.out.println("GCD: " + b);
	}
	
    
}
