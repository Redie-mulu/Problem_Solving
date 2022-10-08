package geeksforgeeks.ArrayRearrangement;
/*
    Search an element in a sorted and rotated array
    An element in a sorted array can be found in O(log n) time via binary search.
     But suppose we rotate an ascending order sorted array at some pivot
     unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
     Devise a way to find an element in the rotated array in O(log n) time.*/
        /*Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
                 key = 3
        Output : Found at index 8

        Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
                 key = 30
        Output : Not found

        Input : arr[] = {30, 40, 50, 10, 20}
                key = 10
        Output : Found at index 3*/

public class SearchElementInSortedRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3));
        System.out.println(search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 30));
        System.out.println(search(new int[]{30, 40, 50, 10, 20}, 10));

    }
    public static int search(int[] a, int k) {
        if(a == null) return -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == k) return i;
        }
        return -1;
    }
    public static int search1(int[] a, int i, int j) {
//        int i = 0;
//        int j = a[a.length-1];
        // now element in the array
       if(j < i) return -1;
       // if there is only one element in the array
       if(i == j) return i;

      // calculate mid
        int mid = (i + j)/2;

        if(mid < j && a[mid] > a[mid + 1]) return mid;
        if(mid > i && a[mid] < a[mid-1]) return mid;
        if(a[i] >= a[mid])return search1(a, i , mid -1);
        return search1(a, mid + 1, j);
    }
}
/* public static int binarySearch(int[]b,int l, int r, int k) {

        if(r >= 1) {
            int mid = 1 + (r -1)/2;
            if(b[mid] == k) return mid;
            if(b[mid] > k) return binarySearch(b, 1, mid-1,k);
            return binarySearch(b, mid+1, r, k);

        }
        return -1;
    }*/