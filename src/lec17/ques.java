/*package lec17;

import java.util.ArrayList;
import java.util.ListIterator;

public class ques {
    public static void main(String[] args) {
        //[1,2,3,4,5,6,7]=output 1234321
        //int [] arr={1,2,3,4,5,6,7};
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int mid=list.size()/2;
        ListIterator<Integer> it=list.listIterator();
        for (int i = 0; i <= mid; i++) {
            System.out.print(it.next()); // print without newline
        }

        // Backward traversal from mid
        for (int i = mid; i >= 0; i--) {
            System.out.print(it.previous());
        }
    }
}*/
package lec17;
import java.util.*;

public class ques{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int mid= list.size()/2;
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext() && it.nextIndex()<=mid){
            Integer x=it.next();
            System.out.println(x);
        }
        System.out.println();
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
    }
}

