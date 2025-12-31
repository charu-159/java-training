//check if two string is anagram
package code50;

import java.util.Arrays;

public class twentyfive25 {
    public static void main(String[] args) {
      String str1="listen";
      String str2="silent";
      //convert to char array
      char [] arr1=str1.toCharArray();
      char[] arr2=str2.toCharArray();
      //sort array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //when array equal
        if(Arrays.equals(arr1,arr2)){
            System.out.println(str1+"and"+str2+"is a anagram");

      }else{
            System.out.println(str1+"and"+str2+"is not a anagram");
        }
    }
}