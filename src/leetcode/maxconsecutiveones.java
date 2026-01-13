//max consecutive ones
package leetcode;
public class maxconsecutiveones {
    public   int consecutiveones(int[] nums) {
        int maxcount = 0;
        int currentcount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentcount++;
                maxcount = Math.max(maxcount, currentcount);
            } else {
                currentcount = 0;
            }
        }
            return maxcount;


    }

    public static void main(String[] args) {
          maxconsecutiveones obj=new maxconsecutiveones();
          int [] nums={1,1,0,1,1,1,1};
        System.out.println(obj.consecutiveones(nums));
    }
}


