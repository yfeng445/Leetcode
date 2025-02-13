/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int allOver = 1;
        for(int i = 0; i<nums.length; i++){
            allOver *= nums[i];
        }
        if(allOver!=0){
            for(int i = 0; i<nums.length; i++){
                nums[i] = allOver/nums[i];
            }
        }
        else{
            int[] tmp = new int[nums.length];
            for(int i = 0; i<nums.length; i++){
                int multi = 1;
                for(int j = 0; j<nums.length; j++){
                    if(j!=i){
                        multi *= nums[j];
                    }
                }
                tmp[i] = multi;
            }
            nums = tmp;
        }
        return nums;
    }
}
// @lc code=end

