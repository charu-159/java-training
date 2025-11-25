package java2;

public class methodoverloading1 {
    static void foo(){
        System.out.println("hello");
    }
    static void foo(int a){
        System.out.println("hello charuuuuu"+a+"brooo");
    }
    static void foo(int a,int b){
        System.out.println("hello charuuuuu"+a+"brooo");
        System.out.println("hello charuuuuu"+b+"brooo");
    }

   public static void main(String[] args) {
        foo();
        foo(300);
        foo(3000,100);
  //argument are actual

    }

}