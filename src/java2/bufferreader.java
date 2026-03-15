package java2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[5][5];

        // Input 5x5 matrix using BufferedReader
        for (int i = 0; i < 5; i++) {
            String line = br.readLine(); // read one row as string
            for (int j = 0; j < 5; j++) {
                arr[i][j] = line.charAt(j) - '0'; // convert char '0'/'1' → int
            }
        }

        // Flip-Flop logic: 0 → 1, 1 → 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = arr[i][j] ^ 1; // XOR trick
            }
        }

        // Print output matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}