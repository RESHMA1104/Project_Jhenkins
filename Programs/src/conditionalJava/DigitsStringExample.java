package conditionalJava;
import java.util.*;
public class DigitsStringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		int chcount = 0;
		int dicount = 0;
		int spcount = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z') {
				chcount++;
			}
			else if(ch >= '0' && ch <= '9') {
				dicount++;
			}
			else {
				spcount++;
			}
		}
		System.out.println("Character count : "+chcount);
		System.out.println("Digit count : "+dicount);
		System.out.println("Symbol count : "+spcount);
	}

}
