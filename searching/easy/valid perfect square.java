// https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1, high = num;
        
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid > num){
                high = mid-1;
            }
            else if(mid*mid < num){
                low = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}