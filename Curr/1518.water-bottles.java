/*
 * @lc app=leetcode id=1518 lang=java
 *
 * [1518] Water Bottles
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int nb = numBottles;
        int cnt = 0;
        while(nb/numExchange>0){
            cnt+=(nb/numExchange);
            nb = nb/numExchange+nb%numExchange;
        }
        return numBottles+cnt;
    }
}
// @lc code=end

