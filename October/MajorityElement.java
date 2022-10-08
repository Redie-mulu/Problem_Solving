package October;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length/2;
        HashMap<Integer, Integer> temp = new HashMap<>();
          for(int i = 0 ; i < nums.length; i++) {
              if(temp.get(nums[i]) == 0) temp.put(nums[i], 1);
              else if(temp.get(nums[i]) > 0) temp.put(nums[i], temp.get(nums[i]) + 1);
          }
          for(int i = 0; i < nums.length; i++) {
              if(temp.get(nums[i]) == len) return nums[i];
          }
          return -1;
    }
    public int majorityElement2(int[] nums) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0) result = nums[i];
            count += (nums[i]==result ? 1 : -1);
        }
        return result;
    }

}
