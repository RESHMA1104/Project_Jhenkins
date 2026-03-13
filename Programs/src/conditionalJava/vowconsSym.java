package conditionalJava;
import java.util.Scanner;

public class vowconsSym {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (Character.toLowerCase(ch)) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a Vowel");
                break;

            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println("It is a Consonant");
                } else {
                    System.out.println("It is a Symbol");
                }
        }
    }
}