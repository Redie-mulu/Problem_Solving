package August.Leet;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,1,0,3,12})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,2})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{0})));
    }
    public static int[] moveZeroes(int[] nums) {
        int i  = 0;
        int j= 1;
        while (j < nums.length){
            if(nums[i] == 0 && nums[j] != 0 ) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[i] == 0 && nums[j] == 0 ) j++;
            else if(nums[i] != 0 && nums[j] != 0 ) {
                i++;
                j++;
            }
            else i++;

        }
        return nums;
    }
}
