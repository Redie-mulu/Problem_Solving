package August.Leet;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("aa"));
    }
    public static int longestPalindrome(String s) {
        int maxLength = 0;
        Map<Character, Integer> storage = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!storage.containsKey(s.charAt(i)) || storage.get(s.charAt(i)) == 0) {
                storage.put(s.charAt(i), 1);
            } else {
                maxLength = maxLength+2;
                storage.put(s.charAt(i), 0);
            }
        }

        if(s.length() == maxLength) return maxLength;
        return maxLength+1;
    }
}
