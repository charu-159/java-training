//find all pair with a given sum
package code50;
public class thirteen {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        //int found=0;
        int target=6;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}