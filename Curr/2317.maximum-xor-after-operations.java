/*
 * @lc app=leetcode id=2317 lang=java
 *
 * [2317] Maximum XOR After Operations 
 */

// @lc code=start
class Solution {
    public int maximumXOR(int[] nums) {
        int result = nums[0];
        for(int i : nums){
            result = result | i;
        }
        return result;
    }
}
// @lc code=end

