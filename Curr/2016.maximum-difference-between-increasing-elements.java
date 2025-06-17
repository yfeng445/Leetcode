/*
 * @lc app=leetcode id=2016 lang=java
 *
 * [2016] Maximum Difference Between Increasing Elements
 */

// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return -1;
        int min = 0;
        int max = 1;
        int maxDiff = -1;

        while(min<nums.length && max<nums.length){
            if(nums[min]!=nums[max]){
               maxDiff = Math.max(nums[max]-nums[min], maxDiff);                
            }

            // System.out.println("min: " + min + ", max: " + max + ", maxDiff:" + maxDiff);
            
            if(nums[max] < nums[min]){
                min = max;
            }

            max ++; 
        }

        return maxDiff;

    }
}
// @lc code=end

