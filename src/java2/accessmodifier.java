package java2;
class c1{
    public int x=5;
    protected int y=10;
    int z=9;
    private int a=44;
    //in same class we access all four modifier
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}


public class accessmodifier {
    public static void main(String[] args) {
    c1 c=new c1();
    //c.meth();   //-class

        //package -private cannot access
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a); //it private in package cant access


    }
}