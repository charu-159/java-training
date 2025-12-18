package lec21;

public class  jump {

    public static boolean canJump(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false; // agar hum is index tak pahunch hi nahi paaye
            }
            max = Math.max(max, i + nums[i]); // max reachable index update
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 0, 3};
        System.out.println(canJump(nums));
    }
}

