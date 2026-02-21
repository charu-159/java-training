package java2;
class Printer {
    void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(300); // delay for visibility
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class T1 extends Thread {
    Printer p;
    T1(Printer p) { this.p = p; }
    public void run() { p.print(2); }
}

class T2 extends Thread {
    Printer p;
    T2(Printer p) { this.p = p; }
    public void run() { p.print(5); }
}

public class multiplethreading {
    public static void main(String[] args) {
        Printer obj = new Printer();

        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);

        t1.start();
        t2.start();
    }
}//