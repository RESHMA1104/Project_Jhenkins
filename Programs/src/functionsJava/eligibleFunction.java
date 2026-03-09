package functionsJava;
import java.util.*;
public class eligibleFunction {
	public static void EligibleCheck(int age) {
		if(age >= 18) {
			System.out.println("He/She is eligible to vote");
		}
		else {
			System.out.println("He/She is not eligible to vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		EligibleCheck(age); 
	}
}