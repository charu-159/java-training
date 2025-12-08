package lec17;

import java.util.ArrayList;
import java.util.ListIterator;

public class ques3 {
    public static void main(String[] args) {
        //[20,10,5,14,3,10] ,t=14,forward move to find target and move backward and remove the no. which less than target value
        //output=[20,14,3,10]
        ArrayList<Integer> list=new ArrayList<>();
        int target=14;
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);
        ListIterator<Integer> it=list.listIterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (x == target) {
                break; // stop when target mil gaya
            }
        }

        // Step 2: Backward move and remove < target
        while (it.hasPrevious()) {
            Integer y = it.previous();
            if (y < target) {
                it.remove(); // remove kar do agar chhota hai
            }
        }

        System.out.println(list);
    }
}



