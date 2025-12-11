package lect20;

class Bank {
    int balance = 100;
    synchronized   void withdraw(int amt) {
        System.out.println(Thread.currentThread().getName() + " checking balance...");
        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName() + " proceeding withdraw...");
            balance = balance - amt;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }
}

class MyThread extends Thread {
    Bank b;
    MyThread(Bank b) { this.b = b; }

    public void run() {
        b.withdraw(100);
    }
}

public class bankdemo  {
    public static void main(String[] args) {
        Bank b = new Bank();
        MyThread t1 = new MyThread(b);
        MyThread t2 = new MyThread(b);
        t1.setName("charu");
        t2.setName("bhumi");
        t1.start();
        t2.start();
    }
}


