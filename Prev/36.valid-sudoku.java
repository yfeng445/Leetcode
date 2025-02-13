/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        if(board.length!=9 || board[0].length!=9){
            return false;
        }

        ArrayList<Character> template = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','7','8','9'));

        for(int i = 0; i<9; i++){
          ArrayList<Character> cp = new ArrayList<>(template);
          for(int j = 0; j<9; j++){
            char cell = board[i][j];
            if(cell != '.'){
                boolean removed = cp.remove(Character.valueOf(cell));
                if(!removed){
                    return false;
                } 
            }
          }
        }

        for(int i = 0; i<9; i++){
            ArrayList<Character> cp = new ArrayList<>(template);
            for(int j = 0; j<9; j++){
              char cell = board[j][i];
              if(cell != '.'){
                  boolean removed = cp.remove(Character.valueOf(cell));
                  if(!removed){
                    return false;
                  } 
                }
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                ArrayList<Character> cp = new ArrayList<>(template);
                for(int x = 0; x<3; x++){
                    for(int y = 0; y<3; y++){
                        char cell = board[i*3+x][j*3+y];
                        if(cell != '.'){
                            boolean removed = cp.remove(Character.valueOf(cell));
                            if(!removed){
                                return false; 
                            } 
                        }                        
                    }
                }
            }
        }

        return true;
    }
}

// @lc code=end

