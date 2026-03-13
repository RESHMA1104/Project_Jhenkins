package JavaCore;
import java.util.*;
public class ifExample3 {
	public static void main(String[] args) {
		boolean seatAvailable = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Seat Number : ");
		String seatNumber = sc.next();
		if(!seatAvailable) {
			System.out.println("Your Seat Number is "+seatNumber);
		}
		else {
			System.out.println("Seat is already booked");
		}
	}
}