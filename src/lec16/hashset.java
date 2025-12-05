package lec16;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        // Step 1: Create HashSet
        HashSet<String> set = new HashSet<>();

        // Step 2: Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate, ignored

        // Step 3: Print set
        System.out.println(set);
        // Output may look like: [Banana, Orange, Apple] (order not fixed)

        // Step 4: Check membership
        System.out.println(set.contains("Banana")); // true

        // Step 5: Remove element
        set.remove("Orange");
        System.out.println(set); // [Banana, Apple]

        // Step 6: Iterate
        for(String fruit : set) {
            System.out.println(fruit);
        }
    }
}