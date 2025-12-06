//find the kth max and min element of array
package code50;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 6};
        int k = 2; // 2nd max and min

        Arrays.sort(arr);

        int kthMin = arr[k - 1];              // k-th min
        int kthMax = arr[arr.length - k];    // k-th max

        System.out.println(k + "th Min: " + kthMin);
        System.out.println(k + "th Max: " + kthMax);
    }
}