/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
import java.util.Arrays;
import java.lang.Integer;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int count = 0;
        int currNum = nums[0];
        for(int i = 1; i<nums.length; i++){
            //System.out.println("i: " + i + " nums[i]: " + nums[i]);
            if(nums[i] == currNum && nums[i] != Integer.MAX_VALUE){
                count++;
                if(count >= 2){
                    nums[i] = Integer.MAX_VALUE;
                    Arrays.sort(nums);
                    i--;
                    k--;
                }
            }
            else{
                currNum = nums[i];
                count = 0;
            }
        }
        return k;
    }
}
// @lc code=end

