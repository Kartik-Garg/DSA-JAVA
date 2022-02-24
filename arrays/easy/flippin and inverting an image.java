// https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //reverse the array
        //invert
        for(int i=0; i<image.length; i++){
            reverse(image[i]);
        }
        return image;
    }
    
    //reversing with swapping.
    public void reverse(int[] arr){
        //swapping elements
        int n = arr.length;
        int t=0;
        for(int i=0; i<n/2; i++){
            t = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = t;
        }
        invert(arr);
    }
    
    //after reverse we invert
    public int[] invert(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        
        return arr;
    }
}