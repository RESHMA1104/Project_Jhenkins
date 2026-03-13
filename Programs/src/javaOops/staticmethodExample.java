package javaOops;
import java.util.*;
public class staticmethodExample {
	private static int totalseats = 20;
	staticmethodExample(){
		System.out.println("Current Seat Availability : "+totalseats);
	}
	public static void bookTicket(int nooftickets) {
		if(nooftickets <= totalseats) {
			System.out.println("No of tickets booked : "+nooftickets);
			totalseats -= nooftickets;
			System.out.println("Current Seat Availability : "+totalseats);
		}
		else {
			System.out.println("Seat Limit Exceed");
		}
	}
	public static void main(String[] args) {
		System.out.println("Screen Ticket Availability Status : ");
		staticmethodExample s1 = new staticmethodExample();
		s1.bookTicket(4);
		staticmethodExample s2 = new staticmethodExample();
		s2.bookTicket(5);
	}
}