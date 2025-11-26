package lec14;
import java.util.HashMap;

class Demo {
    public static void main(String[] args) {
       // HashMap<Integer, Integer> map = new HashMap<>();
        /*map.put(1, 20);
        map.put(2, 30);

        System.out.println(map.get(1));              // Output: 20
        System.out.println(map.getOrDefault(3, 6));  // Output: 6 (kyunki key 3 nahi hai)
        System.out.println(map.containsKey(5));      // Output: false
        for(int x: map.keySet()){
            System.out.println(map.get(x));
        }*/


        //frequency
        //int arr[] = {1, 4, 4, 2, 5, 2, 1};
        /*for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
}*/
//first non repeating char
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "aabcdd";
        for (char x: str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}




