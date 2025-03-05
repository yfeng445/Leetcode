/*
 * @lc app=leetcode id=2579 lang=java
 *
 * [2579] Count Total Number of Colored Cells
 */

// @lc code=start
class Solution {
    public long coloredCells(int n) {
        long t = n;
        return 2 * t * (t-1)+1;
    }
}
// @lc code=end

