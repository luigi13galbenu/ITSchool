package session10.practice.bank_account;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Initial balance: " + account.checkBalance());

        account.deposit(500.35);
        account.witdraw(200.35);
        System.out.println("Final balance: " + account.checkBalance());
    }
}
