//Implement strstr() (substring search
package code50;

public class twentynine {
    // Implement strstr() - substring search
    int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) return i; // full match found
        }
        return -1; // not found
    }

    // Quick test
    public static void main(String[] args) {
        twentynine obj = new twentynine();

        System.out.println(obj.strStr("hello", "ll"));     // Output: 2
        System.out.println(obj.strStr("aaaaa", "bba"));    // Output: -1
        System.out.println(obj.strStr("abc", ""));         // Output: 0
        System.out.println(obj.strStr("", ""));            // Output: 0
        System.out.println(obj.strStr("mississippi", "issip")); // Output: 4
    }
}
