//print all permutation of a string
package code50;

import java.util.*;

public class twentyfour24{
    public static void main(String[] args) {
        String str="abc";
        char [] arr=str.toCharArray();
        List<Character> list=new ArrayList<>();
        for(char c:arr){
            list.add(c);
        }
        for(int i=0;i<6;i++){
            Collections.shuffle(list);
            for(char c:list){
                System.out.println(c);
            }
            System.out.println();
        }

    }
}