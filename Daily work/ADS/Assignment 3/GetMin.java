import java.util.Scanner;
import java.util.Stack;
public class GetMin{    
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int value){
        stack.push(value);
        if(min.isEmpty() || value <= min.peek()){
            min.push(value);
        }
        System.out.println("Min value: " + min.peek());
    }
    
    public static void main(String[] args){
        GetMin g = new GetMin();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements: ");

        while(true){
            String input = s.nextLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            String[] n = input.split(" ");
            //for(String numstr : n){
                try{
                    int value = Integer.parseInt(input);
                    g.push(value);
                } catch(NumberFormatException e){
                    System.out.println("Valid integer");
                }
            //}
        }
        s.close();
    }
    
}