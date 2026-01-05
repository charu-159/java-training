//longest substring without repeating character
package code50;
import java.util.*;

public class thirty32 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest Substring Length = " + lengthOfLongestSubstring(str)); // 3 ("abc")

        String str2 = "bbbbb";
        System.out.println("Longest Substring Length = " + lengthOfLongestSubstring(str2)); // 1 ("b")

        String str3 = "pwwkew";
        System.out.println("Longest Substring Length = " + lengthOfLongestSubstring(str3)); // 3 ("wke")
    }
}