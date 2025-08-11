/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 1;
        int R = points[0][1];

        for(int[] point : points){
            if(point[0] > R){
                R = point[1];
                cnt ++;
            }
        }

        return cnt;
    }
}
// @lc code=end

