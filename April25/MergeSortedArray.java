package April25;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m ==0 && n == 0) return;
        if (m ==0 && n != 0) {
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }

//            return;
        }

        else {
            int i = m-1;
            int j = n-1;
            int k = nums1.length-1;
            while (j >= 0) {
                if(nums2[j] > nums1[i]) {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                }
                else {
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}

/*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 ) nums1 = new int[0];
        else if(m == 0 && n != 0){
            nums1 = nums2;
        }

        else if (m != 0 || n != 0)  {
            int i = 0;
            int j = 0;
            while (i < nums1.length-1) {
                if((nums2[j] < nums1[i])){
                    for(int k = nums1.length-1; k >= i; k--) {
                        nums1[k] = nums1[k-1];
                    }
                    nums1[i] = nums2[j];
                    j++;
                }
                else if((nums2[j] > nums1[i]) && nums1[i+1] == 0){
                    nums1[i+1] = nums2[j];

                    i++;
                    j++;
                }
                else {
                    i++;
                }

            }
        }
        System.out.println(Arrays.toString(nums1));
    }*/
