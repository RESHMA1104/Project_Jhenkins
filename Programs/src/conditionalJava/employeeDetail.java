package conditionalJava;
import java.util.*;
public class employeeDetail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Wages : ");
		double wages = sc.nextDouble();
		System.out.println("Days: ");
		int days = sc.nextInt();
		double total_Salary = wages * days;
		System.out.println("Employee name : "+name);
		System.out.println("Total_Salary : " +total_Salary);
	}
}