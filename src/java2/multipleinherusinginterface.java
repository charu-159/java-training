package java2;
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flies short distances.");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims gracefully.");
    }
}


public class multipleinherusinginterface {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
