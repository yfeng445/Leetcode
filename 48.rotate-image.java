/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start

class Solution {
    public void rotate(int[][] matrix) {

        int len = matrix.length;

        if(len == 1){return;}
        
        int[][] copy = new int[len][len];

        for(int i = 0; i<len; i++){
            for(int j = len-1; j>=0; j--){
                copy[i][len-j-1] = matrix[j][i];
                //System.out.println(matrix[j][i]);
            }
        }

        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                matrix[i][j] = copy[i][j];
            }
        }
    }
}
// @lc code=end

