package java2;
/*abstract class pen{
    abstract void  write();
    abstract void refill();
}
class fountainpen extends pen{
   void write(){
       System.out.println("write");
   }
   void refill(){
       System.out.println("refill");
   }
   void changenib(){
       System.out.println("chnage");
   }

}
public class abstractandinterfaceQUES {
    public static void main(String[] args) {
     fountainpen p=new fountainpen();
     p.write();
     p.refill();
     p.changenib();
    }
}*/


//ques4 -polymorphism
abstract class Telephone {
    abstract void ring();           // abstract method
    abstract void lift();           // abstract method
    abstract void disconnect();     // abstract method
}

class SmartTelephone extends Telephone {
    void ring() {
        System.out.println("SmartTelephone is ringing...");
    }

    void lift() {
        System.out.println("SmartTelephone call lifted.");
    }

    void disconnect() {
        System.out.println("SmartTelephone call disconnected.");
    }

    // Extra smart feature
    void browseInternet() {
        System.out.println("Browsing internet on SmartTelephone.");
    }
}

public class abstractandinterfaceQUES {
    public static void main(String[] args) {
        // Polymorphic reference
        Telephone t = new SmartTelephone();

        t.ring();         // Calls SmartTelephone's ring()
        t.lift();         // Calls SmartTelephone's lift()
        t.disconnect();   // Calls SmartTelephone's disconnect()

        // t.browseInternet(); ❌ Not allowed — reference is of type Telephone
    }
}
//
