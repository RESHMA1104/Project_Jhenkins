package functionsJava;
import java.util.*;
public class workingFunction {
	public static void overtimePay(int hrs) {
		int rupees = 15;
		if(hrs > 40) {
			int pay = hrs - 40;
			int otPay = pay * 15;
			System.out.println("Overtime pay for the Employees : "+otPay);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hrs = sc.nextInt();
		overtimePay(hrs);
	}

}
