/*
 * @lc app=leetcode id=3100 lang=java
 *
 * [3100] Water Bottles II
 */

// @lc code=start
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int cnt = 0;
        int ne = numExchange;
        int nb = numBottles;
        while(nb-ne>=0){
            nb-=(ne-1);
            cnt++;
            ne++;
        }
        return numBottles+cnt;
    }
}
// @lc code=end

