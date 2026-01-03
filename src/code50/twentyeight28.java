//Convert string to integer (like atoi)
package code50;

public class twentyeight28 {
    int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        // 1. Trim leading spaces
        s = s.trim();
        if (s.length() == 0) return 0;

        // 2. Handle sign
        int sign = 1, i = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        long num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // 4. Overflow / Underflow check
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }

    // Quick test
    public static void main(String[] args) {
        twentyeight28 obj = new twentyeight28();
        System.out.println(obj.myAtoi("   -42abc"));       // -42
        System.out.println(obj.myAtoi("4193 with words")); // 4193
        System.out.println(obj.myAtoi("2147483648"));      // 2147483647 (MAX)
        System.out.println(obj.myAtoi("-91283472332"));    // -2147483648 (MIN)
    }
}
