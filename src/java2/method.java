
package java2;

public class method {
    static void tell() {
        System.out.println("helllo");
    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z; // return the calculated value
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        c = logic(a, b); // call logic
        System.out.println(a + " " + b); // still 5 and 7
        System.out.println("c = " + c);  // prints 60
        //method invocation using object creation
        //method obj=new method();
        //c=obj.logic(a,b);
        int a1 = 4;
        int b1 = 5;
        int c1;

        c1 = logic(a1, b1);
        System.out.println(a + " " + b); // still 5 and 7
        System.out.println("c1 = " + c1); // prints 45
    }
}