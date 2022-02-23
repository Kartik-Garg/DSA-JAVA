// https://leetcode.com/problems/richest-customer-wealth/submissions/

class Solution {
    public int maximumWealth(int[][] accounts) {
        //this is a 2D array
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
            
            max = Math.max(sum,max);
        }
        return max;
    }
}