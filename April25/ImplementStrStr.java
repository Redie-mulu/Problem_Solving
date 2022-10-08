package April25;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack == null || haystack.length() == 0) return 0;
        return haystack.indexOf(needle);
    }
}
