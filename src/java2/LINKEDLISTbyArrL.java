//arraylist convertion linkedlist
package java2;

import java.util.LinkedList;

public class LINKEDLISTbyArrL {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(16);
        l2.add(16);

        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(0,6);
        l1.add(0,1);
        l1.addAll(0,l2);//element in starting
        l1.addAll(l2);
        l1.addFirst(33);
        l1.addLast(22);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();  //for clear the element
        //l1.clone();
        l1.set(1,333);

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }

    }
}
