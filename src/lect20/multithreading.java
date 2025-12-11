package lect20;
class mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
//            System.out.println(i+"t2");
        }
    }
}
class multithreading{
    public static void main(String[] args) {
        mythread t1=new mythread();
//        mythread t2=new mythread();
        t1.start();
        try{
            t1.join();//to block the other thread it use
        }catch(Exception e){
            System.out.println(e);
        }
        //t2.start();
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
//        try{
//            t1.join();
//        }catch(Exception e){
//            System.out.println(e);
//        }
        //System.out.println(Thread.currentThread().getName());
    }
}