package JavaCore;
import java.util.*;
public class jaggedMovieExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		String[][] seatType = new String[rows][];
		for(int i=0; i<rows; i++) {
			System.out.println("Enter number of colums");
			int cols = sc.nextInt();
			seatType[i] = new String[cols];
			for(int j=0; j<cols; j++) {
				seatType[i][j] = sc.next();
			}
		}
		int vipcount = 0, premcount = 0, regularcount = 0, viptotal = 5, premtotal = 10, regulartotal = 5;
		System.out.println("MOVIE SEAT ARRANGMENT");
		for(int i=0; i<seatType.length; i++) {
			if(i==0) {
				System.out.println("...............VIP SEATS................");
			}
			else if(i==1) {
				System.out.println("...............PREMIUM SEATS...................");
			}
			else if(i==3) {
				System.out.println("...............REGULAR SEATS....................");
			}
			for(int j=0; j<seatType[i].length; j++) {
				System.out.print(" "+seatType[i][j] +" ");
				if(i==0 && seatType[i][j].equalsIgnoreCase("B")){
					vipcount++;
				}
				else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("B")) {
					premcount++;
				}
				else if(i==3 && seatType[i][j].equalsIgnoreCase("B")) {
					regularcount++;
				}
			}
			System.out.println();
		}
		System.out.println("..............SEAT BOOKED DETAIL.................");
		System.out.println("..............VIP SEATS...................");
		System.out.println("BOOKEED : "+vipcount+ " AVAILABLE : "+(viptotal - vipcount) + " TOTAL:"+viptotal);
		System.out.println("..................PREMIUM SEATS......................");
		System.out.println("BOOKED : "+premcount+" AVAILABLE : "+(premtotal - premcount)+" TOTAL : "+premtotal);
		System.out.println(".......................REGULAR SEATS........................");
	}
}