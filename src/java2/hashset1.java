package java2;

import java.util.HashSet;

public class hashset1 {
    public  static void main(String[] args) {
        //type of constructor
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> set1 =new HashSet<>(4);
        HashSet<Integer> set2=new HashSet<>(4,3);

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set2.add(2);
        System.out.println(set);
        System.out.println(set2);

    }
}