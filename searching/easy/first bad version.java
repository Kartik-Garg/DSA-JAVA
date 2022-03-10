// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      //set boundary left and right
        int l=1;
        int r=n;
        int m;
		//loop one less so that left will have the answer
        while(l<r) {
            m=l+(r-l)/2;
			//if it is bad version it means it might be first bad or any other bad version
            if(isBadVersion(m)) {
			   //keep right to m as it might be the first bad version also
                r=m;
            } else {
			//bad version is present on right side of mid
                l=m+1;
            }
        }
		//return answer
        return l;
    }
}