package October;

public class FindTheDuplicate {
   /* public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));;
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));;
    }*/
    /*public static int findDuplicate(int[] nums) {

    }*/
    /*public static int findDuplicate(int[] nums) {
        int start = nums[0];
        boolean tag = true;
        int n = nums.length;
        int sum1 = 0;
         int sum2 = 0;

        for(int i = 1; i < n; i++) {
            sum1 += i;
        }

        for(int i = 0; i < nums.length; i++) {
            if(start != nums[i]) tag = false;
            sum2 += nums[i];
        }
        if(tag) return start;
        int diff = sum2-sum1;
        while (diff > n) diff = diff/2;
        return diff;
    }*/
}
