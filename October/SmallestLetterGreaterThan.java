package October;

import java.util.LinkedList;

public class SmallestLetterGreaterThan {
    public char nextGreatestLetter(char[] letters, char target) {
        char answer =  binarySearch(letters, 0, letters.length, target);
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(new char[] {"c","f","j"});
        System.out.println(Character.getNumericValue('z'));
//        LinkedList
    }
    public char binarySearch(char[] letters,int start, int end, char target) {
        int mid = end + start/2;
        if(Character.getNumericValue(letters[mid] )== Character.getNumericValue(target)) return letters[mid+1];

        if(Character.getNumericValue(letters[mid]) > Character.getNumericValue(target)) {
            binarySearch(letters, start, mid-1, target);
        }

            return binarySearch(letters, mid+1, end, target);


    }
}
