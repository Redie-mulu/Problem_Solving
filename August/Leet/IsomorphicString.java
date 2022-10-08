package August.Leet;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s==null || s.length()<=1) return true;
        if(s.length()!= t.length()) return false;
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        for(int i= 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if((mapST.containsKey(c1) && mapST.get(c1)!= c2) ||
                    (mapTS.containsKey(c2) && mapTS.get(c2) != c1))return false;
            mapST.put(c1,c2);
            mapTS.put(c2,c1);
        }
        return true;
    }
}
