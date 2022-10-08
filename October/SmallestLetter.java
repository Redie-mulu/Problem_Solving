package October;

public class SmallestLetter {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'd'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if(Character.getNumericValue(letters[0]) > Character.getNumericValue(target)) return letters[0];
        for(int i = 0; i < letters.length-1; i++) {
            if(Character.getNumericValue(letters[i]) <= Character.getNumericValue(target)
                    && (Character.getNumericValue(letters[i+1]) > Character.getNumericValue(target)))
                return  letters[i+1];
        }
        return letters[0];
    }
   /* public static char nextGreatestLetter2(char[] letters, char target) {

    }*/
    public char binarySearch(char[] letters,int start, int end, char target) {
        int mid = end + start/2;
        if(Character.getNumericValue(letters[mid] )== Character.getNumericValue(target)) return letters[mid+1];

        if(Character.getNumericValue(letters[mid]) > Character.getNumericValue(target)) {
            binarySearch(letters, start, mid-1, target);
        }

        return binarySearch(letters, mid+1, end, target);


    }

}
