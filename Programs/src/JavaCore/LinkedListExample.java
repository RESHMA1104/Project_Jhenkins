package JavaCore;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String>();
		System.out.println("Size at the beginning "+list.size());
		list.add("java");
		list.add("C++");
		list.add("javascript");
		list.add("C#");
		list.add("kotlin");
		list.add("python");
		System.out.println("Original Linked List "+list);
		System.out.println("Size after addition Linked List "+list.size());
		list.remove(5);
		list.remove("C#");
		System.out.println("New Linked List "+list);
		System.out.println("Array size after changed "+list.size());
		
	}

}
