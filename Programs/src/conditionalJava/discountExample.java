package conditionalJava;
import java.util.*;
public class discountExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Cost : ");
		float totalCost = sc.nextFloat();
		float discount;
		if(totalCost < 2000) {
			discount = totalCost - ((totalCost/100)*5);
			System.out.println(discount);
		}
		else if(totalCost >= 2000 && totalCost < 5000) {
			discount = totalCost - ((totalCost/100)*25);
			System.out.println(discount);
		}
		else if(totalCost >= 5000 && totalCost <10000) {
			discount = totalCost - ((totalCost/100)*35);
			System.out.println(discount);
		}
		else{
			discount = totalCost - ((totalCost/100)*5);
			System.out.println(discount);
		}
	}
}