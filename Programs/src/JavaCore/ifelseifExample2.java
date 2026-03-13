package JavaCore;
import java.util.*;

public class ifelseifExample2 {

    public static void main(String[] args) {
        
        String seatType;
        System.out.println("Type of seats Available");
        System.out.println("REGULAR");
        System.out.println("EXECUTIVE");
        System.out.println("PREMIUM");
        System.out.println("VIP");
        System.out.println("Choose any one of the option : ");
        
        Scanner sc = new Scanner(System.in);
        seatType = sc.next();

        if(seatType.equalsIgnoreCase("REGULAR")) {
            System.out.println("You have selected Regular seat and cost is Rs.80");
        }
        else if(seatType.equalsIgnoreCase("EXECUTIVE")) {
            System.out.println("You have selected Executive seat and cost is Rs.100");
        }
        else if(seatType.equalsIgnoreCase("PREMIUM")) {
            System.out.println("You have selected Premium seat and cost is Rs.120");
        }
        else if(seatType.equalsIgnoreCase("VIP")) {
            System.out.println("You have selected VIP seat and cost is Rs.150");
        }
        else {
            System.out.println("You have not selected any type");
        }

        sc.close();
    }
}