//check if array is sorted and rotated
package code50;

public class ninth {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8};  // test case

        if (isSortedAndRotated(arr)) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is NOT sorted and rotated");
        }
    }

    static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int countDrops = 0;

        // Check consecutive pairs
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                countDrops++;
            }
        }

        // Also check last and first (rotation wrap-around)
        if (arr[n - 1] > arr[0]) {
            countDrops++;
        }

        // Valid only if exactly one drop
        return countDrops == 1;
    }
}

