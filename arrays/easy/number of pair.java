// https://leetcode.com/problems/number-of-good-pairs/submissions/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numberOfPair = 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    numberOfPair++;
                }
            }
        }
        return numberOfPair;
    }
}