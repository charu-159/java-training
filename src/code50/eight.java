//kadane's algo=maximum subarray sum
//
package code50;

public class eight {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Step 1: Decide whether to start new subarray or extend previous
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Step 2: Track global maximum
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        System.out.println("Maximum Subarray Sum = " + maxSoFar);
    }
}




