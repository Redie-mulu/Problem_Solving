package August;

import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {

    }
   /* public int maxSubArray(int[] nums) {
        int lenght = nums.length;
        int maxSubset = (int) Math.pow(2, lenght);
        int largestSum= 0;
        for(int i = 0; i < maxSubset; i++) {
            int sum = 0;
            for(int j = 0; j < lenght; j++) {
                int len = (int) Math.pow(2,j);
                if((i &(len)) > 0){
                    sum +=(int) nums[j];

                }
            }
        }

    }*/
    public static boolean sumFound(List list, int k) {
        int length = list.size();
        int maxSubset = (int) Math.pow(2,length);
        // the maximum number of possible set of a given list is 2 the power of length of the given set
        for(int i = 0; i < maxSubset; i++) {
//          for each subset start with initial sum of zero
            int sum = 0;
            for (int j = 0; j< length; j++) {
                int len = (int) Math.pow(2, j);

                if((i &(len)) > 0){
                    sum +=(int) list.get(j);
                }
            }
            // check sum with k
            if(sum == k)return true;

        }
        return false;

    }
}

