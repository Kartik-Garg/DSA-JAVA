// https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        //first we calculate both the diagonals
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            //primary diagonal
            sum += mat[i][i];
            //secondary diagonal
            sum += mat[i][mat.length-i-1];
        }
        //if mat is odd, remove middle element once.
        if(mat.length%2 != 0){
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}