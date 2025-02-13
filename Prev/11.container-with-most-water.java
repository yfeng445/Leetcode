/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start


class Solution {
    public int maxArea(int[] height) {
        int maxAmount = 0;
        int left = 0, right = height.length-1;
        while(left<right){
            maxAmount = Math.max(maxAmount, (right-left)*Math.min(height[right], height[left]));
            if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxAmount;
    }
}
// @lc code=end

