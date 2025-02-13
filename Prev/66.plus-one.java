/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i] +=1;
                return digits;
            }
        }
        int[] rtn = new int[digits.length+1];
        rtn[0] = 1;
        return rtn;
    }
}
// @lc code=end

