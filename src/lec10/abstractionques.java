//Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
//'Circle' and 'Rectangle'
package lec10;

// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract double area();

    // Concrete method (optional, for demonstration)
    void displayArea() {
        System.out.println("Area: " + area());
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Main class
class AbstractionQues {
    public static void main(String[] args) {
        Shape c = new Circle(4);       // radius = 4
        Shape r = new Rectangle(5, 6); // length=5, width=6

        c.displayArea();  // Calls abstract method via polymorphism
        r.displayArea();
    }
}
