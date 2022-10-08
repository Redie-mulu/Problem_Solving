package march17;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isValid(String s) {
            if(s == null)return false;
            if(s.length() % 2 != 0) return false;
            Stack<Character> paren = new Stack<>();
            boolean valid = false;
            char ch, chx;
            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                if(ch == '[' || ch == '{' || ch == '(') {
                    paren.push(s.charAt(i));
                }
                else {
                    if(ch == ']' || ch == '}' || ch == ')') {
                        if(paren.isEmpty()) valid = false;
                        else {
                            chx = paren.pop();
                            if((chx == '[' && ch == ']') || (chx == '{' && ch == '}') || (chx == '(' && ch == ')')){
                                valid = true;
                            }
                            else {
                                valid = false;
                                return valid;
                            }
                        }
                    }

                }
            }
            if(!paren.isEmpty()) valid = false;
            return valid;
        }

    }
}
