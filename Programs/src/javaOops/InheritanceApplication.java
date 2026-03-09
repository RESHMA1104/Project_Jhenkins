package javaOops;
class Person{
	private String name;
	private String address;
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "InheritanceApplication [name=" + name + ", address=" + address + "]";
	}
	class Student extends Person {
	    private String program;
	    private int year;
	    private double fee;
	    public Student(String name, String address, String program, int year, double fee) {
	        super(name, address);
	        this.program = program;
	        this.year = year;
	        this.fee = fee;
	    }
	    public String getProgram() {
	        return program;
	    }

	    public void setProgram(String program) {
	        this.program = program;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public double getFee() {
	        return fee;
	    }

	    public void setFee(double fee) {
	        this.fee = fee;
	    }
	    public String toString() {
	        return "Student[" + super.toString() +",program=" + program +",year=" + year +",fee=" + fee + "]";
	    }
	}
	class Staff extends Person {
	    private String school;
	    private double pay;
	    public Staff(String name, String address, String school, double pay) {
	        super(name, address);
	        this.school = school;
	        this.pay = pay;
	    }
	    public String getSchool() {
	        return school;
	    }

	    public void setSchool(String school) {
	        this.school = school;
	    }

	    public double getPay() {
	        return pay;
	    }

	    public void setPay(double pay) {
	        this.pay = pay;
	    }
	    public String toString() {
	        return "Staff[" + super.toString() +",school=" + school +",pay=" + pay + "]";
	    }
	}
	public class InheritanceApplication {
	    public static void main(String[] args) {
	    	Person p = new Person("Reshma", "Chennai");
	        System.out.println(p);

	        Student s = new Student("Anu", "Madurai", "CSE", 2, 50000);
	        System.out.println(s);

	        Staff st = new Staff("Kumar", "Trichy", "ABC School", 40000);
	        System.out.println(st);
	    }
	}
}