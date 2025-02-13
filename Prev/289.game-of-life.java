/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {
    public void gameOfLife(int[][] board) {
        int[][] largerCopy = new int[board.length+2][board[0].length+2];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                largerCopy[i+1][j+1] = board[i][j];
            }
        }
        //visualizeMatrix(largerCopy);
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                int neighbor = 
                largerCopy[i][j]+largerCopy[i+1][j]+largerCopy[i+2][j]
                + largerCopy[i][j+1]+largerCopy[i+2][j+1]
                + largerCopy[i][j+2]+largerCopy[i+1][j+2]+largerCopy[i+2][j+2];
                //System.out.println("i: " + i + ", j: " + j + ", n: " + neighbor);
                if(board[i][j] == 1 && (neighbor<2 || neighbor > 3)) board[i][j] = 0;
                else if(board[i][j] == 0 && (neighbor == 3)) board[i][j] = 1;
            }
        }
    }

    public void visualizeMatrix(int[][] m){
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[0].length; j++){
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }
}
// @lc code=end

