/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = left + (right-left)/2;
        while(left <= right){
            mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        System.out.println(mid);
        if(nums[mid] > target) return mid == 0 ? 0 : mid;
        else return mid+1;
    }
}
// @lc code=end

