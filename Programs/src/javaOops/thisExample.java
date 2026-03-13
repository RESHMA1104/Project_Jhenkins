package javaOops;
import java.util.*;
public class thisExample {
	int empid;
	String empName;
	double empSalary;
	thisExample(int empid, String empName, double empSalary){
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		System.out.println("Employee record created successfully");
	}
	thisExample(){
		this(101, "Resh", 30000);
		System.out.println("Default constructor is called using default data");
		}
	// using this to call another method in the same class
	void registerEmployee() {
		System.out.println("Registering Employee");
		this.display(); // calls another method
	}
	void display() {
		System.out.println("Employee ID : " +empid);
		System.out.println("Employee Name : " +empName);
		System.out.println("Employee Salary : " +empSalary + "\n");
	}
	// using this to pass current object as an argument
	void sendForProcessing() {
		department hr = new department();
		hr.processEmployee(this);
	}
	thisExample updateSalary(double hikePercen) {
		this.empSalary = empSalary + (empSalary * hikePercen / 100);
		return this;
	}
	thisExample updateName(String changeName) {
		this.empName = changeName;
		return this;
	}
	// helper class representing another department
	class department{
		void processEmployee(thisExample e) {
			System.out.println("HR Department Processing Employee");
			System.out.println("Processed Employee "+e.empName+ " With Salary"+e.empSalary);
		}
	}
	public class thisExampleThiskeyword{
		public static void main(String[] args) {
			thisExample emp = new thisExample();
			emp.registerEmployee();
			thisExample emp2 = new thisExample();
			emp2.registerEmployee();
		}
	}
}