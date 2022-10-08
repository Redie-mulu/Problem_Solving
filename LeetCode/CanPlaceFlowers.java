package LeetCode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
       /* System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,0,1}, 2));
        System.out.println(canPlaceFlowers(new int[] {0,0,1,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1,0,0}, 2));*/


        System.out.println(canPlaceFlowers2(new int[] {1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers2(new int[] {1,0,0,0,1}, 2));
        System.out.println(canPlaceFlowers2(new int[] {1,0,0,0,0,1}, 2));
        System.out.println(canPlaceFlowers2(new int[] {0,0,1,0,1}, 1));
        System.out.println(canPlaceFlowers2(new int[] {1,0,0,0,1,0,0}, 2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count= 0;
        if(flowerbed[0] == 0 && flowerbed[1] ==0) {
            flowerbed[0] = 1;
            count++;
        }
        for (int i = 1; i < flowerbed.length-1; i++) {
            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                i++;
                count++;
            }
        }
        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] ==0) {
            flowerbed[flowerbed.length-1] = 1;
            flowerbed[flowerbed.length-1] = 1;
            count++;
        }

        if(count >= n) return true;
        return false;
    }
    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i< flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                int prev = (i == 0 || flowerbed[i-1] == 0) ? 0:1;
                int next = (i==flowerbed.length-1 || flowerbed[i+1] == 0)?0:1;
                if(prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
/*
solution from antony.
* class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==0) return false;
        if (flowerbed.length<3) return //

        // for int i=1;i<flowerbed.length-2;i+=2
            if flower[i]==0 && flower[i-1]==0 && flower[i+1]==0

                return n<=count;



}
}*/