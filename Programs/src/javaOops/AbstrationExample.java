package javaOops;
abstract class Shape {

    void draw() { // concrete method
        System.out.println("Drawing!!!");
    }

    abstract void area();       // abstract method
    abstract void perimeter();  // abstract method
}

class Rectangle extends Shape {
    private int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }
}

class Square extends Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area of Square = " + (side * side));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Square = " + (4 * side));
    }
}

class Circle extends Shape {
    private double radius;
    final static double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle = " + (PI * radius * radius));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * PI * radius));
    }
}

public class AbstrationExample {

    public static void main(String[] args) {

        Shape s;
        s = new Rectangle(3, 5);
        s.area();
        s.perimeter();
        s = new Square(5);
        s.area();
        s.perimeter();
        s = new Circle(4.5);
        s.area();
        s.perimeter();
    }
}