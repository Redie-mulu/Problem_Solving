package August.Leet;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i = 0; i < t.length() && j < s.length(); i++) {

            if(s.charAt(j) == t.charAt(i)) j++;
        }
        if(j != s.length()) return false;
        else return true;
    }
}
