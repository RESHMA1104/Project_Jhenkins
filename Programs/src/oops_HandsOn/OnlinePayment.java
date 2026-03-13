package oops_HandsOn;
abstract class Payment{
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus = "Pending";
	public Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
	}
	abstract boolean validatePayment();
	abstract boolean processPayment();
	public void executeTransaction() {
		if(validatePayment()) {
			if(processPayment()) {
				setPaymentStatus("Success");
			}
			else {
				setPaymentStatus("Failed");
			}
		}
		else {
			setPaymentStatus("Validation Failed");
		}
		generateReceipt();
	}
	public void generateReceipt() {
		System.out.println("-----------Transaction Receipt------------");
		System.out.println("Transaction ID : "+transactionId);
		System.out.println("Amount : "+amount);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Payment Status : "+paymentStatus);
	}
	public void setPaymentStatus(String status) {
		paymentStatus = status;
	}
}
class CreditCardPayment extends Payment{
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	public CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv, String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	boolean validatePayment() {
		return (cardNumber.length() == 16 && cvv.length() == 3);
	}
	boolean processPayment() {
		System.out.println("Processing Credit Card Payment");
		return true;
	}
}
class UPIPayment extends Payment{
	private String upiId;
	private String upiPin;
	public UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}
	boolean validatePayment() {
		return (upiId.contains("@") && upiPin.length() == 4);
	}
	boolean processPayment() {
		System.out.println("UPI Payment Processing......");
		return true;
	}
}
class NetBankingPayment extends Payment{
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	public NetBankingPayment(String transactionId, double amount, String customerName, String bankName, String accountNumber, String ifscCode) {
		super(transactionId, amount, customerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}
	boolean validatePayment() {
		return (accountNumber.length() >= 8 && ifscCode.length() == 11); 
	}
	boolean processPayment() {
		System.out.println("NetBanking Payment Processing......");
		return true;
	}
}
public abstract class OnlinePayment {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment("TX1", 2000, "Reshma", "1234456788996548", "123", "03/12");
		Payment p2 = new UPIPayment("TX2", 3000, "Janani", "Janani@axis", "1234");
		Payment p3 = new NetBankingPayment("TX3", 4000, "Vithya", "Indian Bank", "123456789", "IFSC5000458");
		p1.executeTransaction();
		p2.executeTransaction();
		p3.executeTransaction();
	}
}