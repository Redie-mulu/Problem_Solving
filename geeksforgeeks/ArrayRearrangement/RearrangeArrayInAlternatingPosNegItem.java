package geeksforgeeks.ArrayRearrangement;

import java.util.Arrays;

public class RearrangeArrayInAlternatingPosNegItem {
    /*Rearrange array in alternating positive & negative
    items with O(1) extra space | Set 1
    * */
    /*Given an array of positive and negative numbers,
     arrange them in an alternate fashion such that every positive number
     is followed by negative and vice-versa maintaining the order of appearance.
    Number of positive and negative numbers need not be equal.
    If there are more positive numbers they appear at the end of the array.
    If there are more negative numbers,
    they too appear in the end of the array.

    Examples :
    Input:  arr[] = {1, 2, 3, -4, -1, 4}
    Output: arr[] = {-4, 1, -1, 2, 3, 4}

    Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
    output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}

    */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange(new int[]{1, 2, 3, -4, -1, 4})));
        System.out.println(Arrays.toString(rearrange(new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8})));
    }
    public static int[] rearrange(int[] a) {
        int i = 0;
        int j = 0;
        while (i < a.length-1) {
            if(i % 2 == 0 && a[i] >= 0) {
                j = i;
                while (a[j] >= 0 && j< a.length-1) {
                    j++;
                }
                int temp = a[j];
                for (int k = j; k > i; k--) {
                    a[k] = a[k-1];

                }
                a[i] = temp;
            }
            if(i % 2 != 0 && a[i] < 0) {
                j = i;
                while (a[j] < 0 && j< a.length-1) {
                    j++;
                }
                int temp = a[j];
                for (int k = j; k > i; k--) {
                    a[k] = a[k-1];

                }
                a[i] = temp;
            }

            i++;
        }
        return a;
    }
}
