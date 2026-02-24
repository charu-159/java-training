//moves zeroes
package leetcode;
public  class code283 {
    public static void movezero(int []nums) {
      int index=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
              nums[index]=nums[i];
              index++;
          }
      }
      while(index<nums.length){
          nums[index]=0;
          index++;
      }
    }
    public static void main(String[] args) {
        int [] arr={1,0,2,0,7,0};
        movezero(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}//
//