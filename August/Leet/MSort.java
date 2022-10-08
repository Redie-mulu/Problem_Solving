package August.Leet;

import java.util.Arrays;

public class MSort {
    public static void main(String[] args) {
        Integer[] i = new Integer[]{5, 3, 7, 85, 1, 5, 95};
        System.out.println(Arrays.toString(mergeSort(i)));
    }

    public static <T extends Comparable<T>> T[] mergeSort(T[] t) {
        if (t.length == 1)
            return t;
        int middle = t.length / 2;
        T[] left = mergeSort(subArray(t, 0, middle));
        T[] right = mergeSort(subArray(t, middle, t.length));
        return sort(left, right);
    }

    public static <T extends Comparable<T>> T[] sort(T[] left, T[] right) {
        T[] t = (T[]) new Comparable[left.length + right.length];
        int pr = 0;
        int counter = 0;
        for (int i = 0; i < left.length; ) {
            if (pr < right.length) {
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
