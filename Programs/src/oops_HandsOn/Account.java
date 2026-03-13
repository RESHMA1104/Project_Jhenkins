package oops_HandsOn;
public class Account {
	private String id;
	private String name;
	private int balance;
	Account(String id, String name){
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int Credit(int amount) {
		balance += amount;
		return balance;
	}
	public int Debit(int amount) {
		if(balance >= amount) {
			balance -= amount;
		}
		else {
			System.out.println("Amount is Exceeded from the balance");
		}
		return balance;
	}
	public int 
	transferTo(Account ac2, int amount) {
		if(balance >= amount) {
			balance -= amount;
			ac2.balance += amount;
		}
		else {
			System.out.println("Amount is Exceeded from the balance");
		}
		return balance;
	}
	public String toString() {
		return "Account [ID : "+ id +", Name : "+ name + ", Balance : "+balance +"]";
	}
	public static void main(String[] args) {
		Account ac = new Account("AC1", "Reshma", 10000);
		Account ac1 = new Account("AC2", "JananiSri", 15000);
		Account ac2 = new Account("AC3", "Vithya");
		ac1.Credit(500);
		ac1.Debit(1500);
		ac1.transferTo(ac2, 1000);
		System.out.println(ac);
		System.out.println(ac1);
		System.out.println(ac2);
	}
}