package javaOops;

class Vehicle {
	void run() {
		System.out.println("Vechile is running");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("Truck is running");
	}
}
public class MethodOverriding{
	public static void main(String[] args) {
		Vehicle mr = new Vehicle();
		mr.run();
		Vehicle mr1 = new Truck();
		mr1.run();
	}
}