package October;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDuplicates(new int[]{1,1,2}));
        System.out.println(findDuplicates(new int[]{1}));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer>temp = new ArrayList();
        if(nums == null) return temp;
        for(int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])-1] < 0) {
                temp.add(Math.abs(nums[i]));

            }
            nums[Math.abs(nums[i])-1] *= -1;
    }
        return temp;
}
}
/*
* class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fr = false,fc = false;
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] == 0) {
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
        for(int i = 1; i < matrix.length; i++)
            for(int j = 1; j < matrix[0].length; j++)
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
        if(fr)
            for(int j = 0; j < matrix[0].length; j++) matrix[0][j] = 0;
        if(fc)
            for(int i = 0; i < matrix.length; i++) matrix[i][0] = 0;
    }
}*/
