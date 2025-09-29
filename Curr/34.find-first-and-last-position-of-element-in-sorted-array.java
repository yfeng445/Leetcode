/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx = binarySearch(nums, target);
        if(idx == -1){
            return new int[]{-1, -1};
        } 
        int left = idx, right = idx;
        while(left >= 0 && nums[left] == target) left--; 
        while(right <= nums.length-1 && nums[right] == target) right++;

        return new int[]{left + 1, right-1};

    }

    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {                
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
// @lc code=end

