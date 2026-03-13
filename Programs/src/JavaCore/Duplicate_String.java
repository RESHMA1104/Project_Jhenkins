package JavaCore;
import java.util.*;
public class Duplicate_String {
    public static String removeDuplicateChars(String str) {
        boolean[] seen = new boolean[256]; 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    	String input = sc.nextLine();
        String output = removeDuplicateChars(input);
        System.out.println(output);
    }
}