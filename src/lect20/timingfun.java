package lect20;
class mythreads extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
            System.out.println("downloading file..."+(i*20)+"%");//it give timer
//            try{//this sleep also acces in main it slow down output
//               Thread.sleep(2000);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        }
    }
}
class timingfun {
    public static void main(String[] args) {
        mythreads t1 = new mythreads();
        t1.start();
        try {
            t1.join();

        } catch (Exception e) {
            System.out.println(e);
        }for (int i = 0; i < 5; i++) {
            //System.out.println(i + "main");
            System.out.println("timer"+i);//for timer
            try{
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}