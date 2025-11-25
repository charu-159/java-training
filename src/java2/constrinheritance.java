//constructor overloading
package java2;


class base2 {
    base2(){
        System.out.println("mai ek constructor hu");
    }
    base2(int x){
        System.out.println(" i am overloaded constructor with x value"+x);
    }
}
class derived1 extends base2 {
        derived1() {
            super(0);//overloaded
            System.out.println("i am derived class constructor");
        }
        derived1(int x,int y){
            super(x);
            System.out.println("i am overloaded constructor of derived with y value"+y);
        }
    derived1(int x,int y,int z){
        super(x);
        System.out.println("i am overloaded constructor of derived with z value"+z);
    }
    }

        public class constrinheritance {
            public static void main(String[] args) {
                //us e-super keyword for accrss base2 where parameter is pass

                //base2 b = new base2();// without parameter
                //derived1 d = new derived1();//iwthout parameter
                derived1 d = new derived1(14,9);
                derived1 c = new derived1(14,7,5);
            }
        }

