// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> candy = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
//        for(int i=0; i< candies.length; i++){
//             if(extraCandies+kid > max){
                
//             }
//         }
        
        for(int kid:candies){
            if(extraCandies + kid >= max){
                candy.add(true);
            }
            else{
                candy.add(false);
            }
        }
        return candy;
    }
}