package javaOops;

public class finalExample {
	public final void display(String a) {
		System.out.println(a);
	}
}
class sample extends finalExample{
	public void display(String a) {
		System.out.println(a);
	}
public static void main(String[] args) {
	sample ob = new sample();
	ob.display("Try ME");
	}
}`