package April25;

import java.util.Arrays;

public class SortedRotatedArray {
    public static void main(String[] args) {

        System.out.println(rotate1(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}));
    }
    public static String rotate1(int[] a) {
        int n = a.length-1;
        int count = 0;
        while (a[a.length-1] > a[a.length-2]){
            int temp = a[a.length-1];
            System.out.println(temp);
            for(int i = a.length-1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0]= temp;
            count++;
        }

        int temp = a[a.length-1];
        System.out.println(temp);
        for(int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        System.out.println(binarySearch(a,0, a.length-1, 3));

        int offset = a.length - count;
        if (binarySearch(a, 0, a.length -1, 3) != -1) return "found at index " + binarySearch(a,0, a.length-1, 3) + offset;
         return "not found";
    }
    public static int binarySearch(int[]b,int l, int r, int k) {

        if(r >= 1) {
            int mid = 1 + (r -1)/2;
            if(b[mid] == k) return mid;
            if(b[mid] > k) return binarySearch(b, 1, mid-1,k);
            return binarySearch(b, mid+1, r, k);

        }
        return -1;
    }

}
/*
* public static int[] rotate(int[] a) {
        if (a == null) return null;

        int temp = a[a.length-1];
        System.out.println(temp);
        for(int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
       a[0]= temp;
        return a;
    }*/