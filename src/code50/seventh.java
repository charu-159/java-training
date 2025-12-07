package code50;

public class seventh {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};

        // store last element
        int last = arr[arr.length - 1];

        // shift elements right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

    // put last element at first position
    arr[0] = last;

        // print rotated array
       System.out.print("Rotated Array: ");
      for (int x : arr) {
           System.out.print(x + " ");
        }
 }
}