package geeksforgeeks.ArrayRotations;
/*
Given a sorted and rotated array, find if there is a pair with a given sum
Given an array that is sorted and then rotated around an unknown point. Find if the array has a pair with a given sum ‘x’. It may be assumed that all elements in the array are distinct.

Examples :
Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
Output: true
There is a pair (6, 10) with sum 16

Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
Output: true
There is a pair (26, 9) with sum 35

Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
Output: false
There is no pair with sum 45.
* */
public class SumPairsSortedRotated {
    public static void main(String[] args) {

    }
    public static boolean pairSum(int[] a,  int k) {
        int pivot = 0;
        int[] pair = new int[2];
        for(int i = 0; i < a.length-1; i++) {
            if(a[i] > a[i+1]) {
                pivot= i;
            }
        }
        int i =  pivot+1;
        int j =  pivot;
        int sum = i+ j;
        if(sum == k) {
            return true;
        }
        else if(sum < k) {
            while (i != j) {
                    if(j == a.length-1) j = 0;
                    else j++;
            }

            }

        else if(sum > k) {

        }
        return false;
    }
}
