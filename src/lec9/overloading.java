package lec9;

public class overloading {
    //    Overload a method calculateArea for calculating the area
//    of a circle (use radius as the argument), rectangle (use length and width),
//    and triangle (use base and height).
    double area (int r){
        return 3.14 * r * r;
    }

    double area(double length, double width){   // rectangle
        return length * width;
    }

    double area(int base, int height){          // triangle
        return 0.5 * base * height;
    }

    public static void main(String[]args){
        overloading obj=new overloading();
        System.out.println(obj.area(2));
        System.out.println(obj.area(3,12));
        System.out.println(obj.area(1.2,5.4));
    }

}