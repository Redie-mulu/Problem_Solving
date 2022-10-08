package April25;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
/*
        for(int i = 0; i< nums.length; i++) {
            int count = 0;
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && (Math.abs(i -j) <= k)) return true;
            }
        }
        return false;*/

        int i = 0;
        while (i < nums.length) {
            for (int j = 0; j<= k; j++) {
                if(nums[i] == nums[j] && (Math.abs(i -j) <= k)) return true;
            }
            i++;
        }

            return false;
    }
}
