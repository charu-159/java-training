package java2;

interface sampleinterface {
    void math1();
    void math2();
}

interface childsampleinterface extends sampleinterface {
    void math3();
    void math4();
}

class mysampleclass implements childsampleinterface {
    public void math3() {
        System.out.println("hiii");
    }
    public void math4() {
        System.out.println("byrr");
    }
    public void math1() {
        System.out.println("hello");
    }
    public void math2() {
        System.out.println("byrr");
    }
}

public class inheritanceinterface {
    public static void main(String[] args) {
        mysampleclass obj = new mysampleclass();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
