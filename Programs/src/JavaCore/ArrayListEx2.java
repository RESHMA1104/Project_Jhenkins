package JavaCore;
import java.util.*;
public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList<Integer>();
		System.out.println("Initial size of array list is "+ar.size());
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		System.out.println("After insert the array list is "+ar.size());
		System.out.println("Contents of ArrayList "+ar);
		Integer ia[] =  new Integer[ar.size()];
		ia = ar.toArray(ia);
		int sum = 0;
		for(int i:ia) {
			sum += i;
		}
		System.out.println("Sum value is "+sum);
	}

}
