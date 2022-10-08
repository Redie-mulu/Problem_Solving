package August.Leet;

public class SearchSortedRotatedArray {
    public static void main(String[] args) {
        int[] a1 = {4,5,6,7,0,1,2};
        int[] a2 = {4,5,6,7,0,1,2};
        int[] a3 = {1};
//        System.out.println(pivotedBinarySearch(a1,  0 ));
//        System.out.println(pivotedBinarySearch(a2, 3 ));
//        System.out.println(pivotedBinarySearch(a3, 0 ));
    }
    public  int search(int nums[], int target) {
        int n = nums.length;
        int pivot = findPivot(nums, 0, n-1);
        if(pivot == -1) return binarySearch(nums, 0, n-1, target);
        if(nums[pivot] == target) return pivot;
        if(nums[0] <= target) return binarySearch(nums, 0, pivot-1, target);
        return binarySearch(nums, pivot+1, n-1, target);

    }
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if(high < low) return -1;
        int mid = (low + high)/2;
        if(key == arr[mid]) return mid;
        if(key>arr[mid]) return binarySearch(arr, mid+1, high, key);
        return binarySearch(arr, low, mid-1, key);
    }
     public static int findPivot (int[] arr, int low, int high) {
        // base case
        if(high< low) return  -1;
        if(high == low) return low;

        int mid = (low + high )/2;
        if(mid < high && arr[mid] > arr[mid+1]) return mid;
        if(mid > low && arr[mid] < arr[mid-1]) return (mid-1);
        if(arr[low] >= arr[mid]) return findPivot(arr, low, mid-1);
        return findPivot(arr, mid+1, high);
    }
}
