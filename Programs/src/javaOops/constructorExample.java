package javaOops;
public class constructorExample {
    int id;
    String name;
    // Constructor
    constructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Method to display student details
    public void studentDetails() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
    }
    public static void main(String[] args) {
        constructorExample c1 = new constructorExample(101, "Reshma");
        c1.studentDetails();
    }
}