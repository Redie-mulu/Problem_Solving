package geeksforgeeks.ArrayRearrangement;

import java.util.Arrays;

public class RearrangeArrayEvenAndOdd { // I didn't understand the question
    /*Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
     */
    /*Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.
Examples:
        Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
        Output : 4 5 3 6 2 7 1

        Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8}
        Output : 4 5 2 6 1 8 1 8
*/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(rearrange(new int[]{1, 2, 1, 4, 5, 6, 8, 8})));
    }
    public static int[] rearrange(int [] a) {
        int i = 0;
        int j = a.length-1;

        while (i < j) {
           if(i%2 ==  0 && j%2 ==  0 && a[i] < a[j]) {
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
           }
           if(a[i] > a[j] && (i%2 != 0 && j%2 !=  0)) {
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
           }
           i++;
           j--;

       }

        return a;
    }

    public static class CyclicallyRotateArray {
        /* Approach one
            * Time Complexity: O(n) As we need to iterate through all the elements
            Auxiliary Space: O(1)*/
        public static void main(String[] args) {
            System.out.println("Approach one");
            System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5})));
            System.out.println("Approach two");
            System.out.println(Arrays.toString(rotate2(new int[]{1, 2, 3, 4, 5})));
        }
        public static int[] rotate(int[] a) {
            if (a == null) return null;

            int temp = a[a.length-1];
    //        System.out.println(temp);
            for(int i = a.length-1; i > 0; i--) {
                a[i] = a[i-1];
            }
           a[0]= temp;
            return a;
        }


        /* Approach two */
        public static int[] rotate2(int[] a) {
            int i = 0;
            int j = a.length-1;
            while (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
            return a;
        }

    }
}
