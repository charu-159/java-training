//group anagram togther
package code50;
import java.util.*;

public class thirty33 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // sort characters of word to form key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // put into hashmap
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
        // Output: [[eat, tea, ate], [tan, nat], [bat]]
    }
}