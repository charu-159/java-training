package lec21;
//sorted the array
/*public class leetcode {
    public static void main(String [] args) {
     int [] nums={0,1,0,1,2};
     int c1=0;
     int c2=0;
     int c3=0;
     int n=nums.length;
     for(int x:nums){
         if(x==0){
             c1++;
         }else if(x==1){
             c2++;
         }else{
             c3++;
         }
     }
     int idx=0;
     for(int i=0;i<c1;i++){
         nums[idx++]=0;
     }
        for (int i = 0; i < c2; i++) {
            nums[idx++] = 1;
        }

        for (int i = 0; i < c3; i++) {
            nums[idx++] = 2;
        }
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}*/
//dutch national flag

public class leetcode {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 0, 1};

        int low = 0;
        int mid = 0;
        int h = nums.length - 1;

        while (mid <= h) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, h);
                h--;
            }
        }

        // Print result
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    // Swap function
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



