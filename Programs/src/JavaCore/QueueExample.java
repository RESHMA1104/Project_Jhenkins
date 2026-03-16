package JavaCore;
import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		        pq.add(30);
		        pq.add(10);
		        pq.add(20);
		        pq.add(5);
		        System.out.println("Priority Queue: " + pq);
		        System.out.println("Head element: " + pq.peek());
		        while(!pq.isEmpty()) {
		            System.out.println("Removed: " + pq.poll());
		        }
		    }
	}