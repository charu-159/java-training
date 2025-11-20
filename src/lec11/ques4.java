//Q4. Create an interface Shape with a method area().
//Then, create a class Circle that implements Shape and calculates the area using radius = 5.
//Print the area in the main method.
interface Shape {
    void area();
}
class Circle implements Shape {
    int r;
    public Circle(int r) {
        this.r = r;
    }
    public void area(){
        double res=3.14*r*r;
        System.out.println("Area of circle:"+res);
    }
}
public class ques4 {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        c.area();
    }
}
