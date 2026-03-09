package javaOops;
public class objectFunctionEx2 {
	int empid;
	String empname;
	void setEmployee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	void getEmployee() {
		System.out.println("The employee ID :"+empid);
		System.out.println("The employee Name :"+empname);
	}
	public static void main(String[]args) {
		objectFunctionEx2 E1[]=new objectFunctionEx2[2];
		for(int i=0;i<E1.length;i++) {
			E1[i]=new objectFunctionEx2();
		}
		E1[0].setEmployee(1001, "Ram");
		E1[1].setEmployee(1002, "Sita");
		for(int i=0;i<E1.length;i++) {
			E1[i].getEmployee();
		}	
	}
}