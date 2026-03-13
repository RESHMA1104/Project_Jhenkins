package functionsJava;
import java.util.*;
public class primeNumberFunction {
	public static void primeNum(int n) {
		for(int num=2; num<=n; num++) {
			boolean isnum = true;
			for(int i=2; i<=num/2; i++) {
				if(num % i == 0) {
					isnum = false;
				    break;
				    }
				}
			if(isnum) {
				System.out.print(num+" ");
			}
		} 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		primeNum(n);
	}
}