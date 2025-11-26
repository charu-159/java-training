//target number
package lec14;
import java.util.HashMap;

class Demo1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]={1,2,3,5,6};
        int target =9;
        for(int x:arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println("frequency:"+map);
        for(int x:arr){
            int diff=target-x;
            if(map.containsKey(diff)){
                if (x == diff && map.get(x) < 2) {
                    continue;
                }
                System.out.println("Pair found: " + x + " + " +diff + " = " + target);
                return;
            }
        }

        System.out.println("No pair found");
    }


}

