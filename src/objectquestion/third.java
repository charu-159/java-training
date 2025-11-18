// Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
// methods to deposit and withdraw money
package objectquestion;

import org.w3c.dom.ls.LSOutput;

class bankacc{
    float balance;
    bankacc( int accountnumber,String accountholder,float balance){
        this.balance=balance;
        System.out.println(accountnumber);
        System.out.println(accountholder);
        System.out.println(balance);
    }
    void deposit(int x){
        System.out.println("deposited money"+x);
        balance+=x;
        System.out.println(balance);
    }
    void withdraw(int x){
        System.out.println("money to withdraw"+x);
        balance-=x;
        System.out.println(balance);
    }
}
public class third{
    public static void main(String []args){
        //Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
        // methods to deposit and withdraw money.
        bankacc b1=new bankacc(12345,"archii",50000);
        b1.deposit(20);
        b1.withdraw(40);

    }
}


