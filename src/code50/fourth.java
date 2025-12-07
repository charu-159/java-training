//sort an array in 0s ,1s,2s

package code50;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.println("Enter number of elements:");
        int num = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[num];

        // Step 3: Initialize counters
        int count_0 = 0, count_1 = 0, count_2 = 0, index = 0;

        // Step 4: Input elements
        System.out.println("Enter elements (only 0,1,2 allowed):");
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]!=0 && arr[i]!=1 && arr[i]!=2) {
                System.out.println("Invalid element: " + arr[i]);
            }
        }

        // Step 5: Count 0s, 1s, 2s
        for(int i=0; i<num; i++) {
            if(arr[i]==0) count_0++;
            else if(arr[i]==1) count_1++;
            else if(arr[i]==2) count_2++;
        }

        // Step 6: Refill array in sorted order
        for(int i=0; i<count_0; i++) arr[index++] = 0;
        for(int i=0; i<count_1; i++) arr[index++] = 1;
        for(int i=0; i<count_2; i++) arr[index++] = 2;

        // Step 7: Print sorted array
        System.out.println("Sorted array:");
        for(int i=0; i<num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}