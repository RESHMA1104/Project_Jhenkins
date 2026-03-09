package JavaCore;
import java.util.*;
public class oddEvenFunctionTwo {
		public static void sumoddeven(int ub, int lb) {
			int sumodd = 0;
			int sumeven = 0;
			for(int i=lb; i<=ub; i++) {
				if(i % 2 == 0) {
					sumeven += i;
				}
				if(i % 2 != 0)  {
					sumodd += i;
				}
			}
			int absolute = Math.abs(sumeven - sumodd);
			System.out.println("The Sum of odd numbers from 1 to 1000 is : "+sumodd);
			System.out.println("The Sum of even numbers from 1 to 1000 is : "+sumeven);
			System.out.println("The absolute difference between two sums is : "+absolute);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the lower bound : ");
			int lb = sc.nextInt();
			System.out.println("Enter the upper bound : ");
			int ub = sc.nextInt();
			sumoddeven(ub, lb);
		}
	}
