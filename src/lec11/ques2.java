//Create two interfaces A and B. Both interfaces should have a method named display().
//Then, create a class Demo that implements both interfaces.
//Implement the display() method and call it in the main method using a Demo object
package lec11;

interface a{
    void display();
}
interface b{
    void display();
}
class demo implements a,b {
    public void display() {
        System.out.println("hiii");
    }
}
public class ques2 {
    public static void main(String[] args) {

        demo c = new demo();
        c.display();



}

}