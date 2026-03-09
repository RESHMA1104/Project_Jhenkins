package javaOops;
interface Shape{
	double DEFAULT_VALUE = 1.0; // public static final constant
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() { //default method
		return "A shape with unspecified dimensions";
	}
}
abstract class Circle implements Shape{ // implement the shape interface in the shape class
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() { // constructors that uses the default value
		this.radius = DEFAULT_VALUE;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String getDescription() {
		return "A circle with radius "+radius;
	}
}
class Rectangle implements Shape{
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		this.length = DEFAULT_VALUE;
		this.width = DEFAULT_VALUE;
	}
	@Override
	public double calculateArea() {
		return length * width;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * (length * width);
	}
	@Override
	public String getDescription() {
		return "A Rectangle with length " +length+ "and width " +width; 
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		// creating a instance in a circle will result in compilation error
		Circle c = new Circle(5);
	}
}