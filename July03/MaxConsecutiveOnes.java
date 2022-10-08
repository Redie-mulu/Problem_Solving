package July03;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(maxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    public static int maxConsecutiveOnes(int[] a) {
        int maxCont = 0;
        int currentCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                currentCount++;
                if (currentCount > maxCont) maxCont = currentCount;
            } else {
                currentCount = 0;
            }
        }
        return maxCont;
    }
}
