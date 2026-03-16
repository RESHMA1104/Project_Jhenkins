package JavaCore;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String> ar = new ArrayList<>();
		ar.add("C");
		ar.add("A");
		ar.add("E");
		ar.add("B");
		ar.add("D");
		ar.add("F");
		ar.add(1, "G");
		System.out.println("After Insert the size of tje Array List is "+ar.size());
		ar.remove("F");
		ar.remove(2);
		System.out.println("Contents of array after removing: "+ar);
		System.out.println("Size of the array is "+ar.size());
	}

}
