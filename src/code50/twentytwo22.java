//check for palindrome
package code50;
public class twentytwo22 {
    public static void main(String[] args) {
        String str = "madam";
        boolean palindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("it is palindrome:" + str);
        } else {
            System.out.println("it is not a palindrome" + str);
        }
    }
}
