package LeetCode;

import java.util.HashMap;

public class DoubleExist {
    public static void main(String[] args) {
        DoubleExist d1 = new DoubleExist();
        System.out.println(d1.checkIfExist(new int[]{10,2,5,3}));
        System.out.println(d1.checkIfExist(new int[]{3,1,7,11}));
//        System.out.println(d1.checkIfExist(new int[]{7,1,14,11}));
//        System.out.println(d1.checkIfExist(new int[]{3,1,7,11}));
        System.out.println(d1.checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
    }
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Boolean> tempDouble = new HashMap<>();
        int negNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0 && arr[i] < negNum) {
                negNum = arr[i];
            }
        }
        int constNum = 2 * negNum;
        System.out.println(negNum);
        for (int i = 0; i < arr.length; i++) {
            if(negNum < 0) {
                tempDouble.put((2 * arr[i]) - constNum, true);
            }
            else tempDouble.put(arr[i]*2, true);

        }
        for (int i = 0; i < arr.length; i++) {
            if(tempDouble.containsKey(arr[i] + constNum)) return true;
        }
        return false;
    }
}
