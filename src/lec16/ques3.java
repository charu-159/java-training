//order is maintained as inserted whereas in HashSet order is not maintained
package lec16;

import java.util.LinkedHashSet;
import java.util.Scanner;

class linkedhashset{
    public static void  main(String args[]){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        set.add(6);
        set.add(8);
        set.add(7);
        System.out.println(set);
    }
}