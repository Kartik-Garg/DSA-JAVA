//https://leetcode.com/problems/create-target-array-in-the-given-order/ 

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        //list.add(var1,var2)
        //pushes var2 at position var1.
        List<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            //inserts nums[i] at pos index[i] in the list
            list.add(index[i], nums[i]);
        }
        
        //put list to array since method type is array
        for(int i=0; i<nums.length; i++){
            target[i] = list.get(i);
        }
        
        return target;
    }
}