
package code50;

public class fourteen {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        findSubarrayWithSum(arr, target);
    }

    static void findSubarrayWithSum(int[] arr, int target) {
        int start = 0;
        int currSum = 0;

        for (int end = 0; end < arr.length; end++) {
            // add current element to window
            currSum += arr[end];

            // shrink window if sum exceeds target
            while (currSum > target && start <= end) {
                currSum -= arr[start];
                start++;
            }

            // check if we found the target
            if (currSum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray with given sum found.");
    }
}