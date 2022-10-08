package April25;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome( "race a car"));
        System.out.println(isPalindrome( " "));
        System.out.println(isPalindrome( "0P"));

        char c;
        for(c = 'a'; c <= 'z'; ++c)
            System.out.print(c + " ");
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String temp = "";

        for(int i = 0; i < s.length(); i++) {

            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                temp += s.charAt(i);
            }
        }

        int i = 0;
        int j = temp.length()-1;
        while (i < j) {
            if(temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
