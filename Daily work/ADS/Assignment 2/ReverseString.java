import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String st = "";
        for(int i = str.length() - 1; i >= 0; i--){
            st += str.charAt(i);
        }
        System.out.println(st);

    }
    
}
