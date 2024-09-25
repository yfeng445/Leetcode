/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int reach = 0;
        int lastReach = 0;
        for(int i = 0; i < nums.length - 1; i++){
            reach = Math.max(reach, i + nums[i]);
            if (i == lastReach) {
                step++; 
                lastReach = reach;  
                if (lastReach >= nums.length - 1) {
                    break; 
                }
            }
        }
        return step;
    }
}

// @lc code=end

