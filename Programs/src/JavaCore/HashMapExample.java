package JavaCore;
import java.util.*;
public class HashMapExample {
	public static void main(String[] args) {
		HashMap <String, Double> hm = new HashMap<String, Double>();
		System.out.println("Size of the HashMap" +hm.size());
		hm.put("Jhon Doe", 242.34);
		hm.put("Joseph", 478.43);
		hm.put("Raj", 239.58);
		System.out.println("Elements in the Hashmap "+hm);
		System.out.println("Size of the HashMap "+hm.size());
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		for(Map.Entry<String, Double> me:set) {
		System.out.print(me.getKey()+":");
		System.out.println(me.getValue());
		}
	}
}