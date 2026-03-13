package JavaCore;

public class typePromotion {

	public static void main(String[] args) {
		byte b = 50;
		b = (byte)(b*2); // promote into int
		System.out.println(b);
	}
}