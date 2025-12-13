package java2;
class mythread1 extends Thread{
            public mythread1(String name){
                super(name);
            }
            public void run(){
                //int i=0;
                while(true){
                    System.out.println(" thank you:"+this.getName());
                    //i++;
                }
            }
        }
public class threadpriorities {
    public static void main(String[] args) {
        mythread1 t1=new mythread1("charyyy");
        mythread1 t2=new mythread1("gul");
        mythread1 t3=new mythread1("rashi");
        mythread1 t4=new mythread1("bhoooms");
        mythread1 t5=new mythread1("yashi");
        mythread1 t6=new mythread1("deeps");
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
         t6.start();



    }
}