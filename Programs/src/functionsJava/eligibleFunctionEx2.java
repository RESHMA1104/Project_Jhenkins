package functionsJava;

import java.util.Scanner;

public class eligibleFunctionEx2 {
	public static void EligibleCheck(int age, int weight) {
		if(age > 18 && age < 55) {
			if(weight > 45) {
				System.out.println("He/She is eligible to donate blood");
			}
			else {
				System.out.println("He/She is not eligible to donate blood");
			}
			}
		else {
			System.out.println("He/She is not eligible to donate blood");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Enter weight : ");
		int weight = sc.nextInt();
		EligibleCheck(age, weight); 
	}
}