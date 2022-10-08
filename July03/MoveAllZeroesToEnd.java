package July03;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    /*
     * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
     * For example,
     * if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
     * The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZeroes2(new int[]{1, 2, 0, 4, 3, 0, 5, 0})));
        System.out.println(Arrays.toString(moveAllZeroes4(new int[]{1, 2, 0, 0, 0, 3, 6})));
    }

    // O(n) time complexity and extra space is O(n)
    public static int[] moveAllZeroes(int[] a) {
        int[] temp = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                temp[j] = a[i];
                j++;
            }

        }
        return temp;
    }

    public static int[] moveAllZeroes2(int[] a) {
        int k;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
//                System.out.println(i);
                k = i;
                while (a[k] == 0 && k < a.length - 1) {
                    k++;

                }
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        return a;
    }

    // this approach will swap the current element with the next non
    public static int[] moveAllZeroes3(int[] a) {
        int k;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && i < a.length - 1) {
                if (a[i + 1] != 0) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                } else {
                    k = i;
                    if (a[k] == 0) {
                        k++;
                    } else {
                        int temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                    }
                }
            }
        }
        return a;
    }

    public static int[] moveAllZeroes4(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }

        }
        while (count < a.length) {
            a[count++] = 0;
        }
        return a;
    }
}


/*
if(a[i] == 0){
                i++;
            }
            else {
                temp[j] = a[i];
                j++;
            }*/