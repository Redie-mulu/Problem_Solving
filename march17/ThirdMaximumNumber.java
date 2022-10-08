package march17;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3,2,1}));
        System.out.println(thirdMax(new int[]{1,2}));
    }
    public static int thirdMax(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int max = nums[0];
        Arrays.sort(nums);

        int count = 0;
        for (int i = nums.length-1; i < 0; i++) {
//            if(nums[i] > max) max = nums[i];
            if(nums[i] != nums[i-1]) count++;
            if(count == 3) return nums[nums.length  - 3];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }
}
