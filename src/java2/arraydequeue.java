package java2;

import java.util.ArrayDeque;

public class arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> l2=new ArrayDeque<>();
        l2.add(6);
        l2.add(56);
        l2.addLast(3);
        l2.addFirst(4);
        //l2.addAll();
        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());

    }
}