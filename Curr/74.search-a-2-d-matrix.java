/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int row = matrix.length, col = matrix[0].length;
        int left = 0, right = row * col - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int r = mid / col, c = mid % col;
            int val = matrix[r][c];

            if (val == target) return true;
            else if (val > target) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}

// @lc code=end

