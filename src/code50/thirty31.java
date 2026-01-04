//compress a string
package code50;

public class thirty31 {
    public static String compress(String s) {
        String result = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += s.charAt(i - 1) + "" + count;
                count = 1;
            }
        }
        // last character group add karo
        result += s.charAt(s.length() - 1) + "" + count;

        return result;
    }

    public static void main(String[] args) {
        String str = "aaabbcddd";
        System.out.println("Compressed String = " + compress(str));
    }
}