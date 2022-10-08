package August;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{5, 3})));
        System.out.println(Arrays.toString(mergeSort(new int[]{8,5, 3,6,2,98})));
        System.out.println(Arrays.toString(mergeSort(new int[]{77,7,57,4})));
    }

    public static int[] mergeSort(int[] arr) {
        // base case
        if (arr.length == 1) return arr;

        // find the mid-index
        int mid = arr.length / 2;
        // Recursive Steps
        int[] a1 =  mergeSort(partition(arr, 0,mid));
        int[] a2 = mergeSort(partition(arr, mid,arr.length));

        return merge(a1, a2);
    }

    public static int[] partition(int[] arr, int start, int end) {
        int[] temp = new int[end - start];
        int count = 0;
        for(int i = start; i< end; i++) {
            temp[count++] = arr[i];
        }
        return temp;
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length+ arr2.length];
        int k = 0;
        int j = 0;
        int counter = 0;
        while (k < arr1.length && j < arr2.length){
            if(arr1[k] < arr2[j]){
                temp[counter++] = arr1[k++];
            }
            else{
                temp[counter++] = arr2[j++];
            }
        }
        while (k < arr1.length) {
            temp[counter++] = arr1[k++];
        }
        while (j< arr2.length) {
            temp[counter++] = arr2[j++];
        }
        return temp;
    }
}
