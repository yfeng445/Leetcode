
import java.util.Arrays;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start

class Solution {
    public void moveZeroes(int[] nums) {
        int[] tmp = new int[nums.length];
        int pos = 0;
        int counter = 0;
        for(int i : nums){
            if(i == 0) counter ++;
            else{
                tmp[pos] = i;
                pos++;
            }
        }
        for(int i = 0; i<counter; i++){
            tmp[tmp.length-i-1] = 0;
        }
        System.arraycopy(tmp, 0, nums, 0, tmp.length);
    }
}
// @lc code=end

