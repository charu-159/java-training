package lec17;

import java.util.ArrayList;
import java.util.ListIterator;

public class ques2 {
    public static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(-3);
        list.add(-5);
        list.add(-7);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            if(x<0){
                it.set(-x);
            }
        }
        System.out.println(list);

    }
}