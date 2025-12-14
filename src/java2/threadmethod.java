package java2;

        class mythr extends Thread {
            public void run() {
                int i=0;
                while (i<6) {
                    System.out.println("thanks:");
                    i++;
                }
            }
        }
class mythr2 extends Thread {
            public void run() {
                //int i=0;
        while (true) {
            System.out.println("thanks you:");
            try{
                Thread.sleep(465);
            } catch (Exception e) {
                System.out.println(e);
            }
            //i++;
        }
    }
}
public class threadmethod {
    public static void main(String[] args) {
    mythr t1=new mythr();
    mythr2 t2=new mythr2();

    t1.start();
//    try {
//        t1.join();
//    }catch (Exception e){
//        System.out.println(e);
//    }


    t2.start();
    }
}