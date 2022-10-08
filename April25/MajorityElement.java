package April25;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int count = 0;
        int temp = 0;
        for (int i = 0; i< nums.length -1;i++) {
            if(nums[i] == nums[i+1]) count++;
            else {
                if(temp< count) {
                    num = nums[i];
                    temp = count;

                }
                count = 0;
            }
        }
        return num;
    }

}
