/*
 * @lc app=leetcode id=2257 lang=java
 *
 * [2257] Count Unguarded Cells in the Grid
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for(int[] w:walls){
            grid[w[0]][w[1]] = 1;
        }
        for(int[] g:guards){
            grid[g[0]][g[1]] = 2;
        }
        
        for(int[] g:guards){    
            for(int x = g[0]-1; x>=0; x--){
                if(grid[x][g[1]]!=1&&grid[x][g[1]]!=2){
                    grid[x][g[1]] = 3;
                }
                else{
                    break; 
                }
            }
            for(int x = g[0]+1; x<grid.length; x++){
                if(grid[x][g[1]]!=1&&grid[x][g[1]]!=2){
                    grid[x][g[1]] = 3;
                }
                else{
                    break; 
                }
            }
            for(int y = g[1]-1; y>=0; y--){
                if(grid[g[0]][y]!=1&&grid[g[0]][y]!=2){
                    grid[g[0]][y] = 3;
                }
                else{
                    break;
                }
            }
            for(int y = g[1]+1; y<grid[0].length; y++){
                if(grid[g[0]][y]!=1&&grid[g[0]][y]!=2){
                    grid[g[0]][y] = 3;
                }
                else{
                    break;
                }
            }
        }

        int count = 0;
        for(int[] row:grid){
            for(int g:row){
                if(g==0) count++;
            }
        }

        return count;
        
    }
}
// @lc code=end

