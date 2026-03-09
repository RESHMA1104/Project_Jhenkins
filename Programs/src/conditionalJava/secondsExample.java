package conditionalJava;
import java.util.*;
public class secondsExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int seconds = 86400 * days;
		System.out.println(seconds + " seconds for a week");
	}
}