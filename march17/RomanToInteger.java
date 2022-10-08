package march17;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
//        System.out.println(romanToInt("I"));
//        System.out.println(romanToInt("V"));
//        System.out.println(romanToInt("X"));
//        System.out.println(romanToInt("IV"));
//        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        HashMap<String, Integer> romanNum = new HashMap<>();
        romanNum.put("I", 1);
        romanNum.put("V", 5);
        romanNum.put("X", 10);
        romanNum.put("L", 50);
        romanNum.put("C", 100);
        romanNum.put("D", 500);
        romanNum.put("M", 1000);
        int num = 0;
        if (s.length() == 1) return romanNum.get(s);
        else {
            String temp = s;
            int n = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int n1 = romanNum.get("" + s.charAt(i));
                System.out.println(n1);

                int n2 = romanNum.get("" + s.charAt(i+1));

                System.out.println(n2);
                System.out.println();
                if (n1 < n2) {

                    n = n2-n1;
                    i = i + 2;
                }
                else n = n1;

                num = num + n;
            }
            num += romanNum.get("" + s.charAt(s.length() - 1));
        }
        return num;
    }
}
