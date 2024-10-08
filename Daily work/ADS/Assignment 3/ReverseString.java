import java.util.Scanner;
import java.util.Stack;

public class ReverseString{
    public static String Revstr(String str){
        char[] revstr = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++ ){
            stack.push(str.charAt(i));
        }
        int i = 0;
        while(!stack.isEmpty()){
            revstr[i++] = stack.pop();            
        }
        return new String(revstr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str = sc.nextLine(); 
        System.out.println(Revstr(str));
    }
}