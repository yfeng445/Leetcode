/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
            System.out.println(nums[i] != val);
            if(nums[i] != val){
                temp[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i<k; i++){
            nums[i] = temp[i];  
        }  
        return k;
    }
}
// @lc code=end

