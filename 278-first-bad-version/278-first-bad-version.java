/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(!isBadVersion(mid)) start=mid+1;
            else end=mid-1;
        }
        if(!isBadVersion(end)) return end+1;
        return -1;
    }
}