package August.Leet;

import java.util.Arrays;

public class MergeSortForBet {
    public static void main(String[] args) {
        Object[] i = new Object[]{1,4,7,8, ";", 2,3,5,6 };
//        System.out.println(Arrays.toString(mergeSort(i)));
    }

    public static <T extends Comparable<T>> T[] mergeSort(T[] t) {
        // the base case will be array size one
        if (t.length == 1)
            return t;
        // find the index to separate the two arrays
        int middle = 0 ;
        for(int i = 0; i < t.length; i++) {
            if(t[i].equals(';')) middle = i;
        }
        T[] left = subArray(t, 0, middle);
        T[] right = subArray(t, middle, t.length);
        return merge(left, right);
    }

    public static <T extends Comparable<T>> T[] merge(T[] left, T[] right) {
        T[] t = (T[]) new Comparable[left.length + right.length];
        int pr = 0;
        int counter = 0;
        T[] temp = (T[]) new Object[2];
        for (int i = 0; i < left.length; ) {
            if (pr < right.length) {
                temp[0] = left[i];
                temp[1] = right[pr];
                t[counter++] = left[i].compareTo(right[pr]) < 0 ? left[i++] : right[pr++];
            } else {
                t[counter++] = left[i++];
            }

        }
        for (int i = pr; i < right.length; i++)
            t[counter++] = right[i];
        return t;
    }

    public static <T extends Comparable<T>> T[] subArray(T[] arr, int from, int to) {
        T[] t = (T[]) new Comparable[to - from];
        for (int i = from; i < to; i++) {
            t[i - from] = arr[i];
        }
        return t;
    }

}
