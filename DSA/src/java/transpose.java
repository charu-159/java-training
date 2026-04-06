package java;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transpose matrix
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        //found value
        int d = 5;
        boolean flag = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == d)
                    System.out.println("found");

                flag = false;
            }

        }

        if (!flag) {
            System.out.println("not found");
        }


        //spiral
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        System.out.println("spiral");
        if (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.println(matrix[top][i] + " ");
            }
            top++;
        for (int j = top; j <= bottom; j++) {
            System.out.println(matrix[j][right]+" ");
        }
        right --;

        for(int i=right;i>=left;i--){
            System.out.println(matrix[bottom][i]+" ");
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            System.out.println(matrix[i][left]+" ");
        }
        left++;


        }
        //wave from spiral
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;




        sc.close();
    }
}
