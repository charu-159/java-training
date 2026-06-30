package java2;
class validpalindrome {
    public boolean isPalindrome(String s) {
        int st = 0, end = s.length() - 1;

        while (st < end) {
            // Skip non-alphanumeric characters
            while (st < end && !Character.isLetterOrDigit(s.charAt(st))) st++;
            while (st < end && !Character.isLetterOrDigit(s.charAt(end))) end--;

            // Compare lowercase characters
            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end)))
                return false;

            st++;
            end--;
        }
        return true;
    }
}
