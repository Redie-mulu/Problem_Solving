package geeksforgeeks.ArrayRearrangement;

import java.util.Arrays;

public class ReverseArray {
    /*
    * Write a program to reverse an array or string*/
    /*Given an array (or string), the task is to reverse the array/string.
        Examples :
        Input  : arr[] = {1, 2, 3}
        Output : arr[] = {3, 2, 1}

        Input :  arr[] = {4, 5, 1, 2}
        Output : arr[] = {2, 1, 5, 4}

*/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse1(new  int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse1 (new int[]{4, 5, 1, 2})));

        System.out.println(Arrays.toString(reverse2(new  int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse2 (new int[]{4, 5, 1, 2})));
    }
    public static int[] reverse1(int[]a) {
       int[] temp = new  int[a.length];
       int j = 0;
       for (int i = a.length-1; i >= 0; i--) {
           temp[j] = a[i];
           j++;
       }
       a = temp;
       return a;
    }
    public static int[] reverse2(int[]a) {
        int i = 0;
        int j = a.length-1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }

}
