
package code50;
public class fifth {
    public static void main(String[] args) {
        int []arr = {1, 3, 4, 5, -2, -1, -4};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // agar left side positive hai aur right side negative hai → swap
            if (arr[start] >= 0 && arr[end] < 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            // agar left side already negative hai → aage badho
            else if (arr[start] < 0) {
                start++;
            }
            // agar right side already positive hai → peeche aao
            else if (arr[end] >= 0) {
                end--;
            }
        }

        // print final array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}