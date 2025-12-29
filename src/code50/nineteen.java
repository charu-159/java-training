//Merge two sorted arrays without using extra space
package code50;
import java.util.Arrays;

public class nineteen {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9};

        merge(arr1, arr2);

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
    }

    static void merge(int [] arr1, int [] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr1[i] > arr2[0]) {
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // reinsert arr2[0] into correct position
                int first = arr2[0];
                int k;
                for (k = 1; k < m && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }
}
