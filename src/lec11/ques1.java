//Create two interfaces Walkable and Runnable.
//Each should have a method: walk() and run() respectively.
//Then, create a class Human that implements both interfaces and defines both methods.
//Create a main method where an object of Human is created and both methods are called
package lec11;
interface walkable{
    void walk();
}
interface runnable{
void run();
}
class human implements walkable,runnable {
    public void walk() {
        System.out.println("hello");
    }

    public void run() {
        System.out.println("hiii");
    }
}
 public class ques1 {
     public static void main(String[] args) {

         human a = new human();
    a.walk();
    a.run();
 }



}




