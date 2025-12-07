//find intersection and union of two array
package code50;

public class sixth {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Intersection
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // duplicate avoid karne ke liye break
                }
            }
        }

        // Union
        System.out.print("\nUnion: ");
        // pehle arr1 print karo
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        // ab arr2 ke elements check karo ki arr1 me hai ya nahi
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
