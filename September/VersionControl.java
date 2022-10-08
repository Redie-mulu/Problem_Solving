package September;

public class VersionControl {
    boolean isBadVersion(int version) {
        return true;
    }
}
/*public class Solution2 extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start+  (end - start)/2;
            if(isBadVersion(mid)) end = mid;
            start = mid+1;
        }
        return start;
    }
}*/
