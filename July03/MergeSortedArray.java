package July03;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge3(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (k >= 0) {
            if(j<0){
                nums1[k]=nums1[i];
                i--;
            }
            else if(i<0){
                nums1[k]=nums2[j] ;
                j--;
            }
            else if(nums2[i] >= nums1[j]){
                nums1[k] = nums2[i];
                i--;
            }
            else {
                nums1[k] = nums1[j];
                j--;
            }
            k--;
        }
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(k>=0){
            if(i<0){
                nums1[k]=nums2[j--];
            }
            else if(j<0){
                nums1[k]=nums1[i--] ;
            }
            else if (nums2[j]>=nums1[i]){
                nums1[k]=nums2[j--];
            }
            else{
                nums1[k]=nums1[i--];
            }
            k--;
        }
    }
    public static int[] merge3(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;

        for(int i = 0; i < n+m; i++) {
            if(nums1[i] > nums2[count] && i < m) {
                int temp = nums1[i];
                nums1[i] = nums2[count];
                nums2[count] = temp;

            }
            else  if(i>= m && count < n){
                nums1[i] = nums2[count];
                count++;
            }
        }
        return nums1;

    }
}
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(k>=0){
             if(i<0){
                nums1[k]=nums2[j];
                 j--;
            }
            else if(j<0){
               nums1[k]=nums1[i] ;
                i--;
            }
            else if (nums2[j]>=nums1[i]){
                nums1[k]=nums2[j];
                j--;
            }
            else{
                nums1[k]=nums1[i];
                i--;
            }
            k--;
        }
    }
}*/
