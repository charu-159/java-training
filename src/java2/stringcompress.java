package java2;
class stringcompress {
    public int compress(char[] chars) {
        int write = 0; // position to write compressed result
        int read = 0;  // position to read characters

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // count consecutive occurrences
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // write the character
            chars[write++] = currentChar;

            // write the count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write; // new length of compressed array
    }
}
