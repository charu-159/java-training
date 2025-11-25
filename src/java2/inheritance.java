package java2;

    class base{
       public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            System.out.println(" i am in base ans setting x now");
            this.x = x;
        }
        public void printme(){
            System.out.println("i am a constructor");
        }
    }
    class derived extends base{
    public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            System.out.println(" i am in base ans setting y now");
            this.y = y;
        }
    }
public class inheritance {
        public static void main(String[] args) {
       //base b=new base();
            base b=new base();
            b.setX(5);
            System.out.println(b.getX());
            //creating a object of derived class
            derived b1=new derived();
            b1.setX(5);
            System.out.println(b1.getX());

            derived b2=new derived();
            b2.setY(44);
            System.out.println(b2.getY());
    }
}