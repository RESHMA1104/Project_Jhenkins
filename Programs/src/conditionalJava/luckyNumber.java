package conditionalJava;
import java.util.*;
public class luckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car no : ");
		int n = sc.nextInt();
		int sum = 0;
		if(n > 999 && n <= 9999) {
			while(n > 0) {
				int a = n % 10;
				sum = a + sum;
				n /= 10;
			}
			if(sum % 7 ==0 || sum % 5 == 0 || sum % 3 == 0) {
				System.out.println("Lucky Number");
			}
			else {
				System.out.println("Sorry it's not a lucky number");
			}
		}
		else {
			System.out.println(n + " is not a valid car number");
		}
	}
}