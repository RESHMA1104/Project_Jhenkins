package JavaCore;
public class StringExample {
	public static void concat(String s1) {
		s1 = s1 + "ram";
	}
	public static void concat2(StringBuilder s2) {
		s2.append("raj");
	}
	public static void concat3(StringBuilder s3) {
		s3.append("ravi");
	}
	public static void main(String[] args) {
		String s1 = "Hello";
		concat(s1);
		System.out.println("String "+s1);
		StringBuilder s2 = new StringBuilder("Hello, ");
		concat2(s2);
		System.out.println("StringBuilder : "+s2);
		StringBuilder s3 = new StringBuilder("Hello, ");
		concat3(s3);
		System.out.println("StringBuilder : "+s3);
		
	}

}
