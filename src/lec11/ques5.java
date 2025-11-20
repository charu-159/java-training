//Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
//Create a class Car that implements Vehicle.
//Call the default method from an object of Car in the main method
package lec11;
interface vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}
class car implements vehicle {
    public void pop() {
        System.out.println("car is starting...");

    }
}
public class ques5 {
    public static void main(String[] args) {

        car c = new car();
        c.start();
    }
}