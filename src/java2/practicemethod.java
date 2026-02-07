package java2;

public class practicemethod {
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to print a greeting
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Calling add method
        int sum = add(5, 10);
        System.out.println("Sum is: " + sum);

        // Calling greet method
        greet("Charu");
    }
}
/// /
