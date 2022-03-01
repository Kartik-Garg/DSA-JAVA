// https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        //declaring all the directions
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        int dir = 0;
        
        //instead of using for loop
        while(top<=bottom && left<=right){
            if(dir==0){//right direction
                for(int i=left; i<=right; i++){
                    spiralMatrix.add(matrix[top][i]);
                }
                top++;//top is 1 so we move to next row, since first row is done
                dir = 1; //bottom direction
            }
            else if(dir == 1){//bottom direction
                for(int i=top; i<=bottom; i++){
                    spiralMatrix.add(matrix[i][right]);
                }
                right--;
                dir=2;
            }
            else if(dir==2){//left direction
                for(int i=right; i>=left; i--){
                    spiralMatrix.add(matrix[bottom][i]);
                }
                bottom--;
                dir=3;
            }
            else if(dir==3){//up direction
                for(int i=bottom; i>=top; i--){
                    spiralMatrix.add(matrix[i][left]);
                }
                left++;
                dir=0;
            }
        }
        return spiralMatrix;
    }
}