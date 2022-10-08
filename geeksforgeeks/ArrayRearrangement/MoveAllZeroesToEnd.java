package geeksforgeeks.ArrayRearrangement;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    /*
    * Move all zeroes to end of array
    * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
    * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
    * it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
    * The order of all other elements should be same.
    * Expected time complexity is O(n) and extra space is O(1).
Example:
*
    * Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
    Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

    Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
    Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
    * */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{1, 2, 0, 0, 0, 3, 6})));
//        System.out.println(Arrays.toString(moveZeroes(new int[]{1, 2, 0, 4, 3, 0, 5, 0})));
    }
    public static int[] moveZeroes(int[] a) {
        int i = 0;
        int j = a.length-1;
        int k = i;
        while (i < j) {
            if(a[i]==0 && a[j]==0) {
                j--;
            }
                if(a[i]==0&& a[j]!=0) {

                    a[i]=a[j];
                    a[j]=0;
                    j--;


                }

            if(a[i]!=0 && a[j]!=0){
                i++;
            }
            if(a[i]!=0 && a[j]==0){
                j--;
            }


        }
        return a;
    }
}
