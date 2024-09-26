import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class RepeatedChar {
    public static List<Character> rechar(String str) {
        Map<Character, Integer> count = new HashMap<>();
        List<Character> rchar = new ArrayList<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } 
            else {
                count.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1 && entry.getKey() != ' ') {
                rchar.add(entry.getKey());
            }
        }
        return rchar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        List<Character> result = rechar(input);
        System.out.println(result);
        sc.close();
        }
}
