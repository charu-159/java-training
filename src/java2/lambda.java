package java2;
@FunctionalInterface
interface demoano{
        void meth1(int a);
        //void meyh2();
    }
    /*class harryfun implements demoano{
    public void meth1(){
        System.out.println("byeee");
    }
    }*/

//    class AnnoyDemo implements demoano{
//        public void display(){
//            System.out.println("hello");
//        }
//        public void meth1(){
//            System.out.println("i am meth1");
//        }
//
//        @Override
//        public void meyh2() {
//            System.out.println("i am meth2");
//        }
//    }
public class lambda {
    public static void main(String[] args) {
        //demoano obj = new AnnoyDemo();
       // obj.meth1();
        //obj.meth2();
        //anonymous class
        /*demoano obj1 = new demoano() {//it make annoymous class it is not a class but phir bhi c;lass hai
            @Override
            public void meth1() {
                System.out.println("hii");
            }

            @Override
            public void meyh2() {
                System.out.println("hello");
            }
        };
        obj1.meth1();*/

        //lambda expression
//          demoano obj3=new harryfun();
//          obj3.meth1();

        demoano obj3=(a)->{
            System.out.println("i am method 1 from this lambda"+a);
        };
        obj3.meth1(6);
    }
}
