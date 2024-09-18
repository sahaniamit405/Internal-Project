package Encapsulation;

public class BankAccountDetails {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456", "Alice Smith");
        account.deposit(500);
        System.out.println("Current Balance: " + account.checkBalance());
        account.withdraw(200);
        System.out.println("Current Balance: " + account.checkBalance());

        account.withdraw(400);
    }

}
