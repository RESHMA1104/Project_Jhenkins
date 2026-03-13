package javaOops;
public class objectFunction {
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
			objectFunction E1=new objectFunction();//First Object creation
			objectFunction E2=new objectFunction();//Second Object creation
			E1.setEmployee(1001, "Ram");
			E2.setEmployee(1002, "sita");
			E1.getEmployee();
			E2.getEmployee();	
		}	
	}
