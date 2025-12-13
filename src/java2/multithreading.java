//method 1=by extend thread class
package java2;
class Mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
        System.out.println("i thread1 is running");
        System.out.println("i am happy");
        i++;
    }
    }
    }
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("i thread2 is sleeping");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
Mythread1 t1=new Mythread1();
Mythread2 t2= new Mythread2();
t1.start();// start method run the run method by it own way
t2.start();
    }
}