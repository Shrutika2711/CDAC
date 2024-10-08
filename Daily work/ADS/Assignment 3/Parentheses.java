import java.util.Stack;
import java.util.Scanner;

public class Parentheses{
    static boolean isBalance(String para){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < para.length(); i++){
            char ch = para.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false; 
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[') ){
                    return false;
            }
        }
    }
    return stack.isEmpty();
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Expression: ");
        String para = s.nextLine();
        if(isBalance(para)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
        s.close();
    }
}