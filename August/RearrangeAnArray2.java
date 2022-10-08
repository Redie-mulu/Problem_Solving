package August;

import java.util.Arrays;
/*
* Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
* Given an array of integers, the task is to print the array in the order – smallest number, the Largest number, 2nd smallest number,
* 2nd largest number, 3rd smallest number, 3rd largest number, and so on…..
* Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}

Input : arr[] = [1, 2, 3, 4]
Output :arr[] = {1, 4, 2, 3}
* */
public class RearrangeAnArray2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5, 8, 1, 4, 2, 9, 3, 7, 6})));
        System.out.println(Arrays.toString(rearrange(new int[]{5, 8, 1, 4, 2, 9, 3, 7, 6})));
    }
    // Brute force -  first sort the array using selection sort and then rearrange the array this will take O(n2)
    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] rearrange(int[] arr) {
        sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;
        int k = arr.length-1;
        for (int i = 0; i < arr.length-1; i= i+2) {
            temp[i] = arr[j++];
            temp[i+1] = arr[k--];
        }
        return temp;
    }
}
