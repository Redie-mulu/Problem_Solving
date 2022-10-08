package march17;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {

    }
    public static int[] subsetSum(int[] ab, int k) {
        // if the sum of the sub set array is 0 return null
        if(k == 0 || ab == null) return null;
        // sort the array
        Arrays.sort(ab);
        // calculate the midpoint for the sorted array
        int mid = ab[0] + (ab[ab.length - 1] - ab[0])/2;
        int start = ab[0];
        int end = ab[ab.length -1];
        int sum = 0;
        int[] temp = new int[1];

        while (start < end){
            if(ab[mid] == k) {
                temp[0] = ab[mid];
                return temp;
            }
            if(ab[mid] > ab[mid]) {
                end = mid;
            }
            else {
//                for(int i = mid)


            }
        }
return ab;
    }
}
