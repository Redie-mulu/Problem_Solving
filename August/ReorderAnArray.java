package August;

import java.util.Arrays;
import java.util.HashMap;

public class ReorderAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reorder(new int[]{10, 11, 12}, new int[]{1, 0, 2})));
        System.out.println(Arrays.toString(reorder(new int[]{50, 40, 70, 60, 90}, new int[]{3,  0,  4,  1,  2})));
        System.out.println(Arrays.toString(reorder2(new int[]{10, 11, 12}, new int[]{1, 0, 2})));
        System.out.println(Arrays.toString(reorder2(new int[]{50, 40, 70, 60, 90}, new int[]{3,  0,  4,  1,  2})));
    }
    public static int[] reorder(int[] arr, int[] arr2) {
        // Brute force  use temporary space to store the new array
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            temp[arr2[i]] = j;

        }
        arr = temp;
        return arr;
    }
    // it is possible to solve this problem using hash map but the running time will be O(n) which is the same as the first algorithm
    public static int[] reorder2(int[] arr, int[] arr2) {
        // need some modification
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            temp.put( arr2[i],arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = temp.get(arr2[i]);
            System.out.println(temp.get(arr2[i]));
        }
        return arr;
    }
}
