//find duplicate number in array
package code50;

import java.util.HashSet;

public class sixteen {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 3};  // example array with duplicate 3

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.println("Duplicate number is: " + num);
                return; // exit after finding first duplicate
            }
            seen.add(num);
        }

        System.out.println("No duplicates found!");
    }
}