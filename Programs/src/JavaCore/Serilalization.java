package JavaCore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int empId;
	public String empName;
	//parameterized constructor
	public Employee(int id, String name) {
		
	}
}
public class Serilalization {
	public static void main(String[] args) {
		Employee object = new Employee(1, "Ram");
		String filename = "file.ser";
		//Serialization
		try {
			// saving a object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for Serialization object
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException e) {
			System.out.println("IOException is caught"+e);
		}
		Employee object1 = null;
		//Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for desserialization of object
			object1 = (Employee)in.readObject();
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id = "+object1.empId + "Employee Name = "+object1.empName);
		}
	}

}
