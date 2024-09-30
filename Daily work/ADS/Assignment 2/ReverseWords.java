import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Words: ");
        String str = s.nextLine();
        String [] word = str.split(" ");
        for(int i = word.length - 1; i >= 0; i--){
            System.out.print(word[i] + " ");
        }
        s.close();
    }
    
}
