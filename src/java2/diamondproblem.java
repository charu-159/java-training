// Base interface
interface A {
    void show();
}

// Interface B extends A
interface B extends A {
    default void show() {
        System.out.println("Show from B");
    }
}

// Interface C extends A
interface C extends A {
    default void show() {
        System.out.println("Show from C");
    }
}

// Class D implements both B and C
class D implements B, C {
    // Must override show() to resolve ambiguity
    @Override
    public void show() {
        // Explicitly choose which interface's method to use
        B.super.show();   // You can also use C.super.show()
        System.out.println("Show from D");
    }
}

public class diamondproblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}//
//
;


