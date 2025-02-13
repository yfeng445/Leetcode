/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

 import java.util.ArrayList;
 import java.util.List;
 
 class Solution {
     public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> result = new ArrayList<>();
         
         // Define boundaries
         int xMin = 0;
         int xMax = matrix.length - 1;
         int yMin = 0;
         int yMax = matrix[0].length - 1;
 
         while (xMin <= xMax && yMin <= yMax) {
             // Traverse Right
             for (int y = yMin; y <= yMax; y++) {
                 result.add(matrix[xMin][y]);
             }
             xMin++; // Move the top boundary down
 
             // Traverse Down
             for (int x = xMin; x <= xMax; x++) {
                 result.add(matrix[x][yMax]);
             }
             yMax--; // Move the right boundary left
 
             if (xMin <= xMax) {
                 // Traverse Left
                 for (int y = yMax; y >= yMin; y--) {
                     result.add(matrix[xMax][y]);
                 }
                 xMax--; // Move the bottom boundary up
             }
 
             if (yMin <= yMax) {
                 // Traverse Up
                 for (int x = xMax; x >= xMin; x--) {
                     result.add(matrix[x][yMin]);
                 }
                 yMin++; // Move the left boundary right
             }
         }
 
         return result;
     }
 }
 
// @lc code=end

