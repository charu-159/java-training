/*Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
perimeter. Create objects with different values and call those methods*/
package objectquestion;

class Rectangle{
    int length;
    int breadth;
    float area(){
        return length*breadth;
    }
    float perimeter(){
        return 2*(length+breadth);
    }
    void display(){
        System.out.println("length="+length);
        System.out.println("breadth="+breadth);
        System.out.println("Area="+area());
        System.out.println("Perimeter="+perimeter());
    }
}
public class second {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=10;
        r1.breadth=20;
        Rectangle r2=new Rectangle();
        r2.length=8;
        r2.breadth=9;
        r1.display();
        r2.display();

    }
}