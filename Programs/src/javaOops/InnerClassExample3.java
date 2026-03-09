// Method Local Inner Class
package javaOops;
class Outer{
	int value = 58;
	public void outerClassMethod() {
		System.out.println("Inside the method of Outer Class");
		class Inner{
			public void InnerClassMethod() {
				System.out.println("Inside the method of inner class");
				System.out.println("Value " +value);
			}
		}
		Inner i = new Inner();
		i.InnerClassMethod(); 
	}
}
public class InnerClassExample3 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerClassMethod();
	}
}