package geeksforgeeks.ArrayRearrangement;

import java.util.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{2, 1, 5, 6, 3}, 3));
        System.out.println(minimumSwaps(new int[]{2, 7, 9, 5, 8, 7, 4}, 5));
    }
    public static int minimumSwaps(int[] a, int k) {
        int count = 0;
        int i = 0;
        int j = a.length-1;
        while (i < j)  {
            /*if(a[i] <= k ) {
                i++;
            }*/
            if (a[i] >= k && a[j] <= k) {

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                count++;
//                i++;
                j--;

            }
            i++;
        }
        System.out.println(Arrays.toString(a));
        return count;
    }

}
