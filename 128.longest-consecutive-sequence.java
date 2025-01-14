/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int maxConsecutive = 1;
        int currConsecutive = 1;
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]+1 == nums[i+1]){
                currConsecutive ++;
            }
            else if(nums[i] == nums[i+1]){
                
            }
            else{
                maxConsecutive = Math.max(maxConsecutive, currConsecutive);
                currConsecutive = 1;
            }
        }
        maxConsecutive = Math.max(maxConsecutive, currConsecutive);


        return maxConsecutive;
    }
}
// @lc code=end

