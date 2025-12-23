//missing number in array
package code50;
public class fifteen {
    public static void main(String[] args) {
        int [] arr={1,3,4,5,6,7};
        int n=arr.length;
        // Step 1: Expected sum of numbers from 1 to n+1
                int expectedSum = (n + 1) * (n + 2) / 2;

                // Step 2: Actual sum of given array
                int actualSum = 0;
                for(int num : arr) {
                    actualSum += num;
                }

                // Step 3: Missing number
                int missing = expectedSum - actualSum;

                System.out.println("Missing number is: " + missing);
            }
        }
