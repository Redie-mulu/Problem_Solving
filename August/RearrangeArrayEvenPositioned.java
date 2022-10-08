package August;

import java.util.Arrays;

public class RearrangeArrayEvenPositioned {
    /*Rearrange array such that even positioned are greater than odd
    Given an array A of n elements, sort the array according to the following relations :

        A[i] >= A[i-1], if i is even.

        A[i] <= A[i-1], if i is odd.
        Print the resultant array.
            Input : A[] = {1, 2, 2, 1}
            Output :  1 2 1 2
            Explanation :
            For 1st element, 1  1, i = 2 is even.
            3rd element, 1  1, i = 4 is even.

            Input : A[] = {1, 3, 2}
            Output : 1 3 2
            Explanation :
            Here, the array is also sorted as per the conditions.
            1  1 and 2 < 3.
    * */
    public static void main(String[] args) {
//        System.out.println(1 % 2);
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1, 2, 2, 1})));
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1, 3, 2})));
    }
    public static int[] rearrangeArray(int[] arr){
        int i = 0;
    // traverse the array from the second element by using two pointers and swap based on even and odd requirement
        // running time will be O(n)
        for (int j = 1; j < arr.length; j++){
            System.out.println(arr[j]);
            if(j % 2 == 0 && arr[j] > arr[i]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
            else if (j % 2 != 0 && arr[j] < arr[i]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
            i++;
        }
        return arr;
    }
    // We can also solve this problem using sorting but the running time will be O(n log n)

}
