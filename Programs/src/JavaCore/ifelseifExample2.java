package JavaCore;
import java.util.*;
public class ifelseifExample2{

	public static void main(String[] args) {
		String seatType;
		System.out.println("Type of seats Available\nREGULAR\nEXECUTIVE\nPREMIUM\nVIP\nChoose any one of the option : ");
		Scanner sc = new Scanner(System.in);
		seatType = sc.next();
		if(seatType.equals(REGULAR)) {
			System.out.println("You have selected Executive seat and cost is Rs.80");
		}
		else if(seatType.equals(PREMIUM)) {
			System.out.println("You have selected Premium seat and cost is Rs.100");
		}
		else if(seatType.equals(EXECUTIVE)) {
			System.out.println("You have selected Regular seat and cost is Rs.120");
		}
		else if(seatType.equals(VIP)) {
			System.out.println("You have selected Regular seat and cost is Rs.150");
		}
		else {
			System.out.println("You have not selected any type");
		}
	}
}