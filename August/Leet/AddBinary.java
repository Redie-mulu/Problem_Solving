package August.Leet;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        String res = "";
        int carry = 0;
        int length = a.length() > b.length() ? a.length() : b.length();
        for (int i = 0; i < length; i++) {
            int digitA = 0;
            int digitB = 0;
            int total = 0;

            if (i < a.length()) digitA = (int) a.charAt(i)-'0';
            if (i < b.length()) digitB = (int) b.charAt(i)-'0';

            total = digitA+ digitB + carry;
            int n = total%2;
            System.out.println(n);
            char c = (char)n;
            System.out.println(c);

            res = (c) + res;;

            carry = total/2;
        }
        if(carry != 0) res = "1" + res;
        return res;

    }

    public static String reverseString(String a) {
        String temp = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            temp += a.charAt(i);
        }
        return temp;
    }

}
