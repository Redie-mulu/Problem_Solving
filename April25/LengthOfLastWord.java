package April25;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("    fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
    public  static int  lengthOfLastWord(String s) {
        /*
        option one
        if (s.length() == 0 || s == null) return 0;
        String[] words = s.split(" ");
        return words.length == 0? 0 : words[words.length-1].length();*/
        int n  = s.length();
        while ( n > 0 && s.charAt(n-1) == ' ') n--;
        int i = n-1;
        while (i > -1 && s.charAt(i) != ' ' ) i--;
        return n-1-i;


    }
}
/*
*  while (j > 0){
                if((s.charAt(j) == ' ' || s.charAt(j-1) == '.' ) && j >= 0){
                    j--;
                }
                else if (j > 0){
                    while (s.charAt(j )!= ' ' && j >= 0){
                        count++;
                        j--;
                    }
                }
            }*/
/*
*
*  int j = s.length() -1;
        System.out.println(s.charAt(j));
        int count = 0;
        int i  =j;
/*
           if(s.charAt(j) != ' ' && s.charAt(j) !='.' ) {
              i = j;

           }
           */

          /* if(s.charAt(j) == ' ' || s.charAt(j) =='.' )  {
                   while (s.charAt(j) != ' ' && s.charAt(j) !='.' ) {
                   j--;

                   }
                   }
                   i = j;

                   while (i >= 0 && s.charAt(i) != ' ') {
                   count++;
                   i--;
                   }*/
