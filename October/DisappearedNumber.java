package October;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisappearedNumber {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));;
        System.out.println(findDisappearedNumbers(new int[] {1,1}));;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> temp = new HashMap<>();

        for(int i = 0; i < nums.length;i++) {
            temp.put(nums[i], 1);
        }
        System.out.println(nums.length);
        for(int i = 1; i <= nums.length;i++) {
            if(!temp.containsKey(i)) result.add(i);
        }
        return result;
    }


}

