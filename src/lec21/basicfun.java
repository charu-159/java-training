package lec21;

import java.util.ArrayList;
import java.util.List;

public class basicfun {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        List<Integer>res=list.stream().filter(n->n>30).toList();
        List<Integer>mapres=list.stream().map(n->n=n*3).toList();
        int data=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);
    }
}