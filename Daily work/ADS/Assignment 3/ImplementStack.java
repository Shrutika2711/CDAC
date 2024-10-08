import java.util.Scanner;
import java.util.Stack;
public class ImplementStack{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Choose:- \n1.Push\n2.Pop\n3.Display\n4.Exit");
            int choice = s.nextInt();
            s.nextLine();

            if(choice == 1){
                System.out.println("Push: ");
                String ele = s.nextLine();
                //int num = s.nextInt();
                String[] n = ele.split(" ");

                for(String numstr : n){
                    try{
                        int num = Integer.parseInt(numstr);
                        stack.push(num);
                        System.out.println(num + " Push ");
                    }catch (NumberFormatException e){
                        System.out.print(" "+ numstr);
                    }
                }
                // stack.push(num);
                // System.out.println(num);
            }
            else if(choice == 2){
                if(!stack.isEmpty()){
                    int pop = stack.pop();
                    System.out.println(pop);
                }
                else{
                    System.out.println("Stack is empty");
                }
            }
            else if (choice == 3) {
                System.out.println(stack);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        s.close();
    }
}