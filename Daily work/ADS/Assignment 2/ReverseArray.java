
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of list: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter numbers: " + " ");

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        for(int i = arr.length - 1; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
    
}
