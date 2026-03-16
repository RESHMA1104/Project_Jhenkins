package JavaCore;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		Stack <String> s = new Stack<>();
		System.out.println("Size of the vector is "+s.size());
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		System.out.println("Elements in the Stack is "+s);
		System.out.println("Size of the Stack is "+s.size());
		s.pop();
		System.out.println("Element of the Stack after removal is "+s);
		System.out.println("size of the Stack after removal is "+s.size());
		
	}

}
