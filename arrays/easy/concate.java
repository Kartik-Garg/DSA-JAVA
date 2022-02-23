// https://leetcode.com/problems/concatenation-of-array/submissions/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int len = nums.length;
        //create an array of double size and then assign values
        
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}