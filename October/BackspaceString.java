package October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackspaceString {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));

    }
    public static boolean backspaceCompare(String s, String t) {
        int s_pointer = s.length()-1;
        int t_pointer = t.length()-1;

        int s_skips = 0;
        int t_skips = 0;
        while (s_pointer >= 0 || t_pointer >= 0) {
            while (s_pointer >= 0) {
                if(s.charAt(s_pointer) == '#'){
                    s_skips++;
                    s_pointer--;
                }
                else if(s_skips > 0) {
                    s_skips--;
                    s_pointer--;
                }
                else {
                    break;
                }
            }
            while (t_pointer >= 0) {
                if(t.charAt(t_pointer) == '#'){
                    t_skips++;
                    t_pointer--;
                }
                else if(t_skips > 0) {
                    t_skips--;
                    t_pointer--;
                }
                else {
                    break;
                }
            }
            if(s_pointer >= 0 && t_pointer >= 0 && s.charAt(s_pointer) != t.charAt(t_pointer)) return false;
            if((s_pointer >= 0) != (t_pointer >= 0)) return false;
            s_pointer--;
            t_pointer--;
        }
        return true;
    }
    /*public static boolean backspaceCompare(String s, String t) {
        List<Character> temp1 = new ArrayList<>();
        List<Character> temp2 = new ArrayList<>();
        int k = 0;
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#') count++;

        }
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '#') count2++;
        }
        if(count == s.length()/2 && count2== t.length()/2) return true;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#') temp1.add(s.charAt(i));
            if(s.charAt(i) == '#') temp1.remove(i-1);

        }
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '#') temp2.add(t.charAt(i));
            if(t.charAt(i) == '#') temp2.remove(i-1);

        }
        System.out.println(Arrays.toString(new List[]{temp1}));
        System.out.println(Arrays.toString(new List[]{temp2}));
        if(temp1.size() != temp2.size()) return false;
        for(int i = 0; i < temp1.size(); i++) {
            if(temp1.get(i) != temp2.get(i)) return false;
        }
        return true;
    }*/
}
