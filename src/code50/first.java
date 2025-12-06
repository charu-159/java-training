package code50;
public class first {
    public static void main(String[] args) {
        //max and min element in array
        /*int[] arr = {2, 4, 6, 8, 10};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }if (arr[i] < min) {
                min = arr[i];   // update min
            }
        }
        System.out.println("Max: " + max); // 11
        System.out.println("Min: " + min); // 2
    }
}*/
//reverse an array place
int [] arr={1,4,6,7,8};
int start=0;
int end=arr.length-1;
while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}
for(int num:arr){
    System.out.println(num+"");
}
}
    }