package JavaCore;
import java.util.*;
public class purchaseDiscount2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price");
		double price = sc.nextInt();
		int quantity = sc.nextInt();
		double puramount = price * quantity;
		double disamount = 0, paidamount = 0;
		if(price > 1000) {
		    disamount = puramount * 0.10; 
			paidamount = puramount - disamount;
			System.out.println(paidamount);
		}
		else {
			disamount = puramount * 0.05; 
			paidamount = puramount - disamount;
			System.out.println(paidamount);
		}
	}
}