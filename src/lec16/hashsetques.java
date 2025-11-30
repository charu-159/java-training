package lec16;
import java.util.HashSet;

class set{
    public static void main(String[] args) {
        /*HashSet<Integer> set=new  HashSet<>();
        set.add(6);
        set.add(5);
        set.add(10);
        //set.contains(10);
        System.out.println(set);*/


        //find if duplicate element exist in array
        int arr[] = {1, 2, 4, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        if(arr.length==set.size()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        set.remove(1);
        System.out.println(set);
    }
}