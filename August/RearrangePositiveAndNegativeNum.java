package August;

import java.util.Arrays;

/*
* Rearrange positive and negative numbers using inbuilt sort function
* Given an array of positive and negative numbers, arrange them such that all negative integers appear before all
* the positive integers in the array without using any additional data structure like a hash table, arrays, etc.
* The order of appearance should be maintained.
*
* Input :  arr[] = [12, 11, -13, -5, 6, -7, 5, -3, -6]
Output : arr[] = [-13, -5, -7, -3, -6, 12, 11, 6, 5]

Input :  arr[] = [-12, 11, 0, -5, 6, -7, 5, -3, -6]
Output : arr[] =  [-12, -5, -7, -3, -6, 0, 11, 6, 5]
* */
public class RearrangePositiveAndNegativeNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange(new int[]{12, 11, -13, -5, 6, -7, 5, -3, -6})));
    }
    public static int[] rearrange(int[] arr) {
        // use bubble sort way of rearrangement, the running time will be O(n2)
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] > 0) {
                System.out.println(arr[i]);
                for (int j = i; j < arr.length-1; j++){
                    if(arr[j+1] < 0 ){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
//                    i++;
                }
            }
        }
        return arr;
    }
    // I think this problem will have recursive solution which will run in O(n log n)
}
