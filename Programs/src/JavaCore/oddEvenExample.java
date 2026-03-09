package JavaCore;
import java.util.*;
public class oddEvenExample {
	public static void sumoddeven(int num) {
		int sumodd = 0;
		int sumeven = 0;
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				sumeven += i;
			}
			if(i % 2 != 0)  {
				sumodd += i;
			}
		}
		System.out.println("Sum Even : "+sumeven);
		System.out.println("Sum Odd : "+sumodd);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sumoddeven(num);
	}
}