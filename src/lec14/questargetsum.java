//target number
package lec14;
import java.util.HashMap;

class Demo1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 2, 3, 5, 6};
        int target = 9;


        for (int i=0;i<arr.length;i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                /*if (x == diff && map.get(x) < 2) {
                    continue;
                }
                System.out.println("Pair found: " + x + " + " +diff + " = " + target);
                return;
            }
        }

        System.out.println("No pair found");*/
                System.out.println(map.get(diff) + "," + i);
                break;
            }
            map.put(arr[i], i);


        }
    }
}

