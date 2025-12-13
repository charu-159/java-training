package lec21;
import java.util.*;
class my implements Runnable{
    public void run(){
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
public class multitreading2 {
    public static void main(String[]args) {
        my m1 = new my();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();
    }
}