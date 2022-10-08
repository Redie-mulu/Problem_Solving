package July03;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{1,0,2,3,0,4,5,0})));
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{1,2,3})));
    }
    public static void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length && count < arr.length; i++) {
            temp[count] = arr[i];
            if(arr[i] == 0 && count < arr.length-1) {
                temp[count+1] = 0;
                count++;
            }
            count++;
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    public static int[] duplicateZeros2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            i++;
            if(arr[i] == 0) {
                int j = arr.length-1;
                while (j > i) {
                    arr[j] = arr[j-1];
                    j--;
                }
            }
        }
        return arr;
    }

}
