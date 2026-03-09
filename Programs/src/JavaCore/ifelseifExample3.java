package JavaCore;

public class ifelseifExample3{

	public static void main(String[] args) {
		int age = 15;
		int weight = 50;
		if(age > 18) {
			if(weight > 50) {
				System.out.println("You are eligible to doante blood");
			}
			else {
				System.out.println("You are not eligible because you are under Weight");
			}
		}
		else {
			System.out.println("You are not eligible because you are under age");
		}

	}

}
