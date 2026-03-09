//Regular Inner Class
package javaOops;
class OuterClass{
	int age = 18;
	public void checkAge() {
		System.out.println("In checkAge() Method call");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show() Method call of inner class");
		}
	}
}
public class InnerClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println("OuterClass.Age : "+outer.age); // outer class field member
		System.out.print("OuterClass.checkAge() : ");
		outer.checkAge(); // outer class method member
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println("Inner class method call : ");
		inner.show();
	}

}
