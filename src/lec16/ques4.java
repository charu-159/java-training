//data is always sorted by default
package lec16;
import java.util.Scanner;
import java.util.TreeSet;

class treeSet{
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(5);
        set.add(3);
        System.out.println(set);
    }
}