package JavaCore;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector <String> v = new Vector<String>();
		System.out.println("Size of the vector is "+v.size());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Elements in the vector is "+v);
		System.out.println("Size of the vector is "+v.size());
		System.out.println("Capacity of the vector is "+v.capacity());
		
	}

}
