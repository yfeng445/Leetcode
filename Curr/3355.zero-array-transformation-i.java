/*
 * @lc app=leetcode id=3355 lang=java
 *
 * [3355] Zero Array Transformation I
 */

// @lc code=start

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diffArr = new int[nums.length];

        for(int[] query : queries){
            diffArr[query[0]]++;
            if(query[1] != diffArr.length-1) diffArr[query[1]+1]--;
        }

        if(nums[0] > diffArr[0]) return false;
        int transitionVal = diffArr[0];
        nums[0] -= diffArr[0];

        for(int i = 1; i<nums.length; i++){
            transitionVal += diffArr[i];
            nums[i] -= transitionVal;
            if(nums[i] > 0) return false;
        }

        return true;
    }
}
// @lc code=end

