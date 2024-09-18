package Object;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }


    public void deposit(double amount) {
        balance = amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs" + balance);
        System.out.println();
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("100453634", "Ansh");

        account.displayDetails();


        account.deposit(2000);
        account.withdraw(700);
        account.withdraw(500);


        account.displayDetails();
    }
}
