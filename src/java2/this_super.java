package java2;

class class1{
    int a;
    class1(int a){
        a=a;//it confuse or give output null so use this keyword
        this.a=a;
    }
    public int return1(){
        return 1;
    }
    public int getA(){
        return a;
    }
}
class doclass extends class1{
    doclass(int c){
        super(c);
        //super(0)
        System.out.println("i am constructor");
    }

}


public class this_super {
    public static void main(String[] args) {
        class1 b=new class1(5);
        System.out.println(b.getA());
        doclass f=new doclass(8);
        //System.out.println();
    }
}