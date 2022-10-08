package march17;

public class Only14 {
    public static void main(String[] args) {
        System.out.println(only14(new int[]{1, 4, 1, 4}));
        System.out.println(only14(new int[]{1, 4, 2, 4}));
        System.out.println(only14(new int[]{1, 1}));
    }
    public static boolean only14(int[] nums) {
        boolean notFound = true;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] == 1 || nums[i] == 4)) {
                notFound = true;
                count++;
            }
        }
        if(count != nums.length) return false;
        else return true;
    }
}
