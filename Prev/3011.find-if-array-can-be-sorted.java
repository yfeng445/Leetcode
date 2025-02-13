/*
 * @lc app=leetcode id=3011 lang=java
 *
 * [3011] Find if Array Can Be Sorted
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean canSortArray(int[] nums) {
        int[] sortedNums  = nums.clone();
        Arrays.sort(sortedNums); // The compare result
        for(int i = 0; i<nums.length-1; i++){
            if(getSetbit(nums[i]) != getSetbit(nums[i+1])){
                int j = i+1; 
                int minAfter = nums[j];
                int maxBefore = nums[i];
                for(int k = 0; k<i; k++){
                    if(nums[k]>maxBefore){
                        maxBefore = nums[k];
                    }
                }
                for(; j<nums.length; j++){
                    if(nums[j]<minAfter){
                        minAfter = nums[j]; 
                    }
                }
                //System.out.println(minLocal);
                if(maxBefore > minAfter){
                    return false;
                }
            }
        }

        return true;
    }

    public int getSetbit(int i){
        int setBit = 0;
        while(i!=0){
            if(i%2 == 1){
              setBit++;  
            }
            i = i/2;
        }
        return setBit;
    }
}
// @lc code=end

