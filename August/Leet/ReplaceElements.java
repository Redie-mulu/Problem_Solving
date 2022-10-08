package August.Leet;

import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        ReplaceElements re = new ReplaceElements();
        System.out.println(Arrays.toString(re.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(re.replaceElements(new int[]{400})));
        System.out.println("option two .....");
        System.out.println(Arrays.toString(re.replaceElementsTwo(new int[]{17, 18, 5, 4, 6, 1})));

    }

    // Brute force algorithm by using double for loop the running time will be 0(n2)
    public int[] replaceElements(int[] arr) {
        if (arr == null || arr.length == 0) return new int[]{};
        for (int i = 0; i < arr.length; i++) {
            int temp = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > temp) temp = arr[j];
            }
            arr[i] = temp;
        }
        return arr;
    }

    // loop through the array starting from the end and keep the maximum value seen so far

    //running time will be O(n) and space complexity will be O(1)
    public int[] replaceElementsTwo(int[] arr) {

        int largestSoFar = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = largestSoFar;
           if(temp> largestSoFar) largestSoFar = temp;
        }
        return arr;
    }


}
