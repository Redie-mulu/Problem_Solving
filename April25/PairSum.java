package April25;

public class PairSum {
    public static void main(String[] args) {
        System.out.println(9%10);
//        System.out.println(findSum(new int[]{11, 15, 6, 8, 9, 10}, 16));
//        System.out.println(findSum(new int[]{11, 15, 26, 38, 9, 10}, 35));
//        System.out.println(findSum(new int[]{11, 15, 26, 38, 9, 10}, 45));
    }
    public static boolean findSum(int[] a, int k) {
        while (a[a.length-1] > a[a.length-2]){
            int temp = a[a.length-1];
            for(int i = a.length-1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0]= temp;
        }

        int temp = a[a.length-1];
        for(int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;

        int i = 0;
        int j = a.length -1;
        while (i < j) {
            if(a[i] + a[j] == k) return true;
            if(a[i] + a[j] > k) j--;
            if(a[i] + a[j] < k) i++;
        }
        return false;
    }
}
