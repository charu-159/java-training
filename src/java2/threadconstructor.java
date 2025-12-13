package java2;
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<3){
            System.out.println(" i am thread");
            i++;
        }
    }
}
class mythread2 extends Thread{
    public mythread2(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<3){
            System.out.println(" i am thread");
            i++;
        }
    }
}
public class threadconstructor{
    public static void main(String[] args) {
    mythread t1=new mythread("charyyy");
        mythread2 t2=new mythread2("bhooms");
    t1.start();
    t2.start();
        System.out.println("the id of the thread t1 is"+ t1.getId());
        System.out.println("the name of thread:"+t1.getName());
        System.out.println("the id of the thread t1 is"+ t2.getId());
        System.out.println("the name of thread:"+t2.getName());
    }
}