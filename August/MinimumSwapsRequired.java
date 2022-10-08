package August;

public class MinimumSwapsRequired {

/*
* Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
* Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
Output: 1

Explanation:
To bring elements 2, 1, 3 together, swap
element '5' with '3' such that final array
will be-
arr[] = {2, 1, 3, 6, 5}

Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
Output: 2
* */
    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{2, 1, 5, 6, 3}, 3));
        System.out.println(minimumSwaps(new int[]{2, 7, 9, 5, 8, 7, 4}, 5));
    }

    public static int minimumSwaps(int[] a, int k) {
        int i = 0;
        int j = a.length - 1;
        int count = 0;
        while (i < j) {
            if (a[i] > k && a[j] <= k) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
                i++;
                count++;
                System.out.println(a[i]);
            }
            else if  (a[j] > k) {
                j--;
            }
          else i++;

        }
        return count;
    }

}
