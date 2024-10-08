import java.util.Scanner;
import java.util.Stack;

public class PostFixExp {

    static int pfix(String fix) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = fix.split(" ");  

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {  
                stack.push(Integer.parseInt(token));
            } 
            else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression");
                }
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "/":
                        if (val1 == 0) {
                            throw new ArithmeticException("Error ");
                        }
                        stack.push(val2 / val1);
                        break;
                    case "*":
                        stack.push(val2 * val1);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String fix = s.nextLine();

        try {
            System.out.println("PostFix Result: " + pfix(fix));
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
