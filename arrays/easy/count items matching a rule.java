//https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //if rulekey=type, see value in 1 and so on, if match count++
        //return count
        int count=0;
        for(List<String> list:items){
            if(ruleKey.equals("type") && list.get(0).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("color") && list.get(1).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("name") && list.get(2).equals(ruleValue)){
                count++;
            }
        }
        
        return count;
        
    }
}