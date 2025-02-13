

/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1) return false;
        //if(nums.length == 2 && k<=2) return nums[0] == nums[1];
        for(int i = 0; i<nums.length-k; i++){
            for(int j = 1; j<=k; j++){
                if(nums[i] == nums[i+j]){
                    System.out.println("i: " + i + ", j: " + (i+j));
                    return true; 
                } 
            }
        }
        int[] tail = new int[Math.min(k, nums.length)];
        for(int i = nums.length-Math.min(k, nums.length); i<nums.length; i++){
            tail[i+Math.min(k, nums.length)-nums.length] = nums[i];
        }
        for(int i = 0; i<tail.length; i++){
            for(int j = i+1; j<tail.length; j++){
                if(tail[i] == tail[j]) return true;
            }
        }
        return false;
    }
}
// @lc code=end

