package march17;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);

    }
    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null) {
            System.out.println("No element to be merged!");
            return;
        }
        if(nums1 == null) {
            System.out.println(Arrays.toString(nums2));
        }
        if(nums2 == null) {
            System.out.println(Arrays.toString(nums2));
        }
        int k = 0;
        int k2 = 0;
        while (nums1[k] != 0) {
            k++;
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums1));
        for(int i = k; i < nums1.length; i++) {
            nums1[i] = nums2[k2];
            k2++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }*/

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length-1;
        int l1 = m-1;
        int l2 = n-1;
        while (i >= 0) {
            if(nums1[l1] > nums2[l2]) {
                nums1[i] = nums1[l1];
                l1--;
            }
            if(nums1[l1] < nums2[l2]) {
                nums1[i] = nums2[l2];
                l2--;
            }
           i--;

        }
        System.out.println(Arrays.toString(nums1));
    }
}
