package javaOops;
import java.util.*;
public class MethodOverloading {
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.add(2, 5));
		System.out.println(mo.add(6.78, 9.46));
	}
}