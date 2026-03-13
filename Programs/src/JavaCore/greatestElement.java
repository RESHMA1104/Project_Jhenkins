package JavaCore;
import java.util.*;
public class greatestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int gre = arr[0];
		int sma=arr[0];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i] > gre) {
					gre = arr[i];
				}
				if(arr[i] < sma) {
					sma= arr[i];
				}
			}
		}
		System.out.println(gre);
		System.out.println(sma);
	}
}