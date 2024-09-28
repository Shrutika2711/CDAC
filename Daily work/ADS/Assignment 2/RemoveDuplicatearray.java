import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatearray {
    public static int remove(int[] num, int index, int length){
        if(index >= num.length){
            return length;
        }
        for(int i = index + 1; i < length; i++){
        if(num[index] ==num[i] ){
            for(int j = i; j < length - 1; j++){
                num[j] = num[j + 1];
            }
            length --;
            i--;
        }
        
    }
    return remove(num, index + 1, length);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        int n = s.nextInt();
        int[] num = new int [n];

        for(int i = 0; i < n; i++){
            num [i] = s.nextInt();
        }
        int new_length = remove(num, 0, n);
        System.out.println(" " + new_length);
        System.out.println(" " + Arrays.toString(Arrays.copyOf(num, new_length)));
        s.close();
    }
}
