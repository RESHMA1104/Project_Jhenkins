package javaOops;
interface Bank {

    void deposit();
    void withdraw();

}
class SBI implements Bank {
    public void deposit() {
        System.out.println("Money Deposited");
    }
    public void withdraw() {
        System.out.println("Money Withdrawn");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.deposit();
        obj.withdraw();
    }
}