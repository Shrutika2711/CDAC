import java.util.Scanner;
public class ArrayLeftRotation {
    public static void left(int[] arr, int d){
        int i;
        int n = arr.length;
        d %= n;
        int[] temp = new int[d];
        for(i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        for(i = 0; i < n -d; i++){
            arr[i] = arr[i + d];
        }
        for(i = 0; i < d; i++){
            arr[n - d + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of list: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter numbers: " + " ");

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("d: ");
        int d = s.nextInt();
        left(arr,d);
        System.out.print(" ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        s.close();
    }
    
}
