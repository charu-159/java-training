//store the common elements from the two arrays
package lec16;
import java.util.HashSet;
import java.util.Scanner;
class common{
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,4,5,6};
        HashSet<Integer> set1=new HashSet<Integer>();
        for(int x:arr1){
            set1.add(x);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int y:arr2) {
            if (set1.contains(y)) {
                set2.add(y);
            }
        }
        System.out.println("Common elements="+set2);
    }
}