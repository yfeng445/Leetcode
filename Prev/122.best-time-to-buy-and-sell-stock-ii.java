/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > currPrice){
                profit += (prices[i] - currPrice);
            } 
            currPrice = prices[i];
        }
        return profit;
    }
}
// @lc code=end

