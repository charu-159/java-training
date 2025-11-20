//multiple inheritance
package lec11;

/*class A{
    void eat(){
        System.out.println("hello");
    }
}
class B{
    void eat(){
        System.out.println("hiii");
    }
}
class c extends A,B{  //multiple not work because when we pass a and b both togther then compiler is confuse ki which is call a or b eat

}
class multiple{
    public static void main(String[] args) {



    }
}*/
//interface=all case are abstract case whether we use abstract or not
//interface main constructor nai banta
interface A{
    void login();

}
interface B{
  /* abstract*/ void login();

}

class C implements A,B{
    @Override
    public void login() {
        System.out.println("hellooo");
    }
}
public class multiple {
    public static void main(String[] args) {
        C c = new C();
        c.login();
    }
}









