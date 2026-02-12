package java2;
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // initial balance
        account.checkBalance();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // invalid case
        account.checkBalance();
    }
}