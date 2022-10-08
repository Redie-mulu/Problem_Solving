package August;

import java.util.Arrays;

public class RearrangeWithExtraSpace {
    /*Given an array of positive and negative numbers, arrange them such that all negative integers appear before all the positive integers in the
    array without using any additional data structure like hash table, arrays, etc. The order of appearance should be maintained.
    Input:  [12 11 -13 -5 6 -7 5 -3 -6]
    Output: [-13 -5 -7 -3 -6 12 11 6 5]
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange3(new int[]{12, 11, -13, -5, 6, -7, 5, -3, -6})));
        System.out.println(Arrays.toString(rearrangeOptionTwo(new int[]{12, 11, -13, -5, 6, -7, 5, -3, -6})));
    }
    public static int[] rearrange3(int[] arr) {
        int cont = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) cont++;
        }
        int k = cont;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) temp[j++] = arr[i];
            else  temp[k++] = arr[i];
        }
        return temp;
    }
    public static int[] rearrangeOptionTwo(int[] arr) {
        int i =  arr.length-1;
        int j =  arr.length-2;
        while(j>=0 ) {
//            System.out.println(arr[i]);
//            System.out.println(arr[j]);
//            System.out.println();
            if(arr[i] < 0 && arr[j] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
                j--;
            }
            else if (arr[i] < 0 && arr[j] < 0){
                j--;

            }
            if(arr[i] > 0 && arr[j] > 0){
                i--;
                j--;
            }
            if(arr[i] > 0 && arr[j] < 0){
                i--;
                j--;
            }
//            else i--;

        }
        return arr;
    }
    // we can solve this problem using quicksort, but we need to modify the merge part of the algorithm
}
