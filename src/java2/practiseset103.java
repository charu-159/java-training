//create an arraylist and stores names of 10 student insideit
//print it for using for each loop
package java2;

import java.util.*;

public class practiseset103 {
    public static void main(String[] args) {
        ArrayList<String> set=new ArrayList<>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 3");
        set.add("student 4");
        set.add("student 5");
        set.add("student 6");
        for(Object o:set){
            System.out.println(o);
        }


        //question create a set in java to store duplicate element inside that set and verify that
        //only one instance is stored
        HashSet<Integer> s=new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(33);
        s.add(55);
        System.out.println(s);
        //Set<Integer> s2=new Set();
        //question date class in java print time
        Date d=new Date();
        System.out.println(d.getHours()+":"+ d.getMinutes()+":"+ d.getSeconds());





    }
}