// Static Nested Class
package javaOops;
class People{
	int age = 21;
	static int weight = 45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In Non Static Display Method");
			System.out.println("Weight Value : "+weight);
		}
		static void staticDisplay() {
			System.out.println("In Static Display Method");
			System.out.println("Weight Value : "+weight);
		}
	}
	Gender g = new Gender();
}
public class InnerClassExample2 {
	public static void main(String[] args) {
		People person = new People();
		person.g.nonStaticDisplay();
		People.Gender.staticDisplay();

	}

}
