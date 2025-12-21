package java2;
@FunctionalInterface
interface myFunctionInterface{
   void thisMethod();
   //void thisMethod2();
}
class NewClass extends phone{
    //@Override
public void showTime(){
    System.out.println("time is 8 pm");
}
@Deprecated
public int sum(int a,int b){
        return a+b;
}

}
public class annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
       NewClass Phone= new NewClass();
       Phone .showTime();
       Phone .sum(5,6);
    }
}