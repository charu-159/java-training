package leetcode;

import java.util.HashMap;

public class isomorphicstring {

    public boolean isomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            // check s → t mapping
            if (mapTS.containsKey(c1)) {
                if (mapTS.get(c1) != c2) return false;
            } else {
                mapTS.put(c1, c2);
            }
            if (mapST.containsKey(c2)) {
                if (mapST.get(c2) != c1) return false;

            } else {
                mapST.put(c1, c2);
            }
        }
        return true;
    }
        public static void main(String[] args) {
            isomorphicstring obj = new isomorphicstring();
            String s = "add";
            String t = "egg";
            System.out.println(obj.isomorphic(s, t)); // Output: true
        }
    }
//




