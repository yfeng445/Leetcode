/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            temp[i] = nums[(i-(k%nums.length)+nums.length)%nums.length];
        }
        //System.out.println(Arrays.toString(temp));
        for(int i = 0; i<nums.length; i++){
            nums[i] = temp[i];
        }
    }
}
// @lc code=end
