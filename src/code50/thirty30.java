//Valid Palindrome after removing at most one character
package code50;

public class thirty30 {
    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // try removing left OR right
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca")); // true (remove 'b' or 'c')
        System.out.println(validPalindrome("racecar")); // true (already palindrome)
        System.out.println(validPalindrome("abcdef")); // false
    }
}