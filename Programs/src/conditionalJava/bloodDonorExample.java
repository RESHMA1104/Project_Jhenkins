package conditionalJava;

import java.util.*;
public class bloodDonorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter weight : ");
		int weight = sc.nextInt();
		if(age > 18 && age < 55) {
			if(weight > 45) {
				System.out.println("The Blood Donor is Eligible");
			}
			else {
				System.out.println("The Blood Donor is not Eligible");
			}
		}
		else {
			System.out.println("The Blood Donor is not Eligible");
		}
	}
}