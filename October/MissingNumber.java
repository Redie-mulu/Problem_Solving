package October;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
    public static int missingNumber(int[] nums) {
        Map<Integer, Boolean> temp = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            temp.put(nums[i], true);
        }


        int result = -1;
        for(int i = 0; i <= nums.length; i++) {
            if(!temp.containsKey(i)) result = i;
        }
        return result;
    }

}
