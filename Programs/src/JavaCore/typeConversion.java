package JavaCore;
public class typeConversion {
	public static void main(String[] args) {
		double d = 100.04;
		long l = (long)d; // convert double into long
		int i = (int)l; // convert long into int
		float f = (float)d;
		System.out.println("double " +d);
		System.out.println("int " +i);
		System.out.println("long " +l);
		System.out.println("float "+f);
	}
}