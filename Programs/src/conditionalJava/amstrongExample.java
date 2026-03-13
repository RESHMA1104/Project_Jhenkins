package conditionalJava;
import java.util.*;
public class amstrongExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n  = sc.nextInt();
		int num = n;
		int sum = 0;
		if(num > 99 && num <=999) {
			while(n > 0) {
				int a = n % 10;
				int b = a*a*a;
				sum += b;
				n /= 10;
			}
			if(sum == num) {
				System.out.println(num + " is a Amstrong number");
			}
			else {
				System.out.println(num + " is not a Amstrong number");
			}
		}
	}
}