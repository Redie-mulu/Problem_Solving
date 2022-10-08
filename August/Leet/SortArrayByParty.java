package August.Leet;

import java.util.Arrays;
/*
* Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
* Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
* Input: nums = [0]
Output: [0]
*
* */

// use two pointers the running time will be O(n)
public class SortArrayByParty {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0,2})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0,2,1})));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length && i < nums.length) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[i] % 2 != 0 && nums[j] % 2 != 0) {
                j++;
            }

//            I have question about this condition?
            else if(nums[i] % 2 == 0  ) {
                i++;
                j++;
            }
            else i++;
        }
        return nums;
    }
}
