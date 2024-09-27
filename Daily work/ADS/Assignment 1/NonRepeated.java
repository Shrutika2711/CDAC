import java.util.Scanner;

public class NonRepeated {
    public static boolean isNonrepeated(String str, char ch, int index, int count){
        if(index == str.length()){
            return count == 1;
        }
        if(str.charAt(index) == ch){
            count ++;
        }
        return isNonrepeated(str, ch, index + 1, count);
    }
    public static Character nonRepeated(String str, int index){
        if(index == str.length()){
            return null;
        }
        char current = str.charAt(index);
        if (isNonrepeated(str, current, 0,0)) {
            return current;            
        } 
        return nonRepeated(str, index + 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        String st = s.nextLine();  
        Character NonRepeated = nonRepeated(st, 0);
        if(NonRepeated != null){
            System.out.println(" " + NonRepeated);
        }
        else{
            System.out.println("" + NonRepeated);
        }
        s.close();
    }
    
}
