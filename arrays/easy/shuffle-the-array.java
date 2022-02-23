//https://leetcode.com/problems/shuffle-the-array/submissions/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        //observed pattern seems something like i+n. XiYn
        //solution1: creating new array
        //ans[0]->nums[0] ; ans[i=1]->ans[i=3]
        //so odd is being replaced with odd and even places are same
        //goes till n (total n iterations)
        int k=0;
        int[] ans = new int[nums.length];
        for(int i=0, j=n; i<n; i++, j++){
            ans[k++] = nums[i];
            ans[k++] = nums[j];
        }
        return ans;
    } 
}