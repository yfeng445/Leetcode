/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix[0].length;
        int n = matrix.length;

        int[][] copy = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                copy[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(copy[i][j]==0){
                    for(int x = 0; x<n; x++){
                        matrix[x][j] = 0;
                    }
                    for(int y = 0; y<m; y++){
                        matrix[i][y] = 0;
                    }
                }
            }
        }
        
    }
}
// @lc code=end

