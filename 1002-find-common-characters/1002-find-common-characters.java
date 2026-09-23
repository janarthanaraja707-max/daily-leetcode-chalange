import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        int[] common = new int[26];

        for (char c : words[0].toCharArray()) {
            common[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] count = new int[26];

            for (char c : words[i].toCharArray()) {
                count[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], count[j]);
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (common[i] > 0) {
                result.add(String.valueOf((char)('a' + i)));
                common[i]--;
            }
        }

        return result;
    }
}