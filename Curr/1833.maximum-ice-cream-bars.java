/*
 * @lc app=leetcode id=1833 lang=java
 *
 * [1833] Maximum Ice Cream Bars
 */

// @lc code=start
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : costs){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int[][] cnt = new int[max-min+1][2];
        for(int i = min; i<=max; i++){
            cnt[i-min] = new int[]{i, 0};
        } 

        for(int c : costs) cnt[c-min][1]++;

        int[] sorted = new int[costs.length];
        int ptr = 0;
        for(int[] ct : cnt){
            for(int i = 0; i<ct[1]; i++){
                sorted[ptr] = ct[0];
                ptr++;
            }
        }

        int pos = 0;
        while(pos<costs.length){
            if(coins<sorted[pos]) return pos;
            coins-=sorted[pos];
            pos++;
        }

        return pos;
        
    }
}
// @lc code=end

