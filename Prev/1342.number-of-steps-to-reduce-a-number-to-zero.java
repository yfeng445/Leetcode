/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */

// @lc code=start
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num!=0){
            if(num%2 == 1){
                num --;
            }
            else{
                num = num/2;
            }
            steps++;
        }
        return steps;
    }
}
// @lc code=end

