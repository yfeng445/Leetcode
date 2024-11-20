/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
        }
        if(sum<target) return 0;

        sum = 0;
        int minLen = Integer.MAX_VALUE;
        int currLen = 0;
        int start = 0, end = 0;
        while(end<nums.length){
            if(sum<target){
                while(sum<target){
                    try{
                        sum+=nums[end];
                        currLen++;
                        end++;
                        System.out.println("start: "+start+", end: "+end+", sum: "+sum+", len: "+currLen+", minLen: "+minLen); 
                    }catch(Exception e){
                        return minLen;
                    }
                    
                }
            }
            if(sum>=target){
                while(sum>=target){
                    try{
                        minLen = Math.min(minLen, currLen);
                        sum-=nums[start];
                        currLen--;
                        start++;
                        System.out.println("start: "+start+", end: "+end+", sum: "+sum+", len: "+currLen+", minLen: "+minLen);                        
                    }catch(Exception e){
                        return minLen;
                    }
                }
            }
        }
        return minLen;   
    }
}
// @lc code=end

