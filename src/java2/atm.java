package java2;
// Account class
class Account{
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// ATM class
class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Main class
public class atm {
    public static void main(String[] args) {
        Account acc1 = new Account(12345, 1111, 5000.0);
        ATM atm = new ATM(acc1);

        if (acc1.validatePin(1111)) {
            atm.checkBalance();
            atm.deposit(2000);
            atm.withdraw(3000);
            atm.checkBalance();
        } else {
            System.out.println("Invalid PIN!");
        }
    }
}