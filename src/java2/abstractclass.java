package java2;
abstract class base1{
     public base1(){
        System.out.println("i am constructor");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child1 extends base1{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
    public void greet1() {
        System.out.println("good night");
    }
}
 abstract class child2 extends base1{
    public void th() {
        System.out.println("good morning");
    }
}



public class abstractclass {
  public  static void main(String[] args) {
      child1 c=new child1();
      //base1 v=new base1(); it not happen b/c it abstrcat class
      //child2 v=new child2(); it also not work b/c it is also a abstract class
    }
}