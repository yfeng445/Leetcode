/*
 * @lc app=leetcode id=2406 lang=java
 *
 * [2406] Divide Intervals Into Minimum Number of Groups
 */

// @lc code=start

import java.util.ArrayList;
class Solution {
    public int minGroups(int[][] intervals) {
        
        int[] range = new int[2];
        range[0] = Integer.MAX_VALUE;
        range[1] = Integer.MIN_VALUE;
        for(int[] interval : intervals){
            range[0] = Math.min(range[0], interval[0]);
            range[1] = Math.max(range[1], interval[1]);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = range[0]; i<=range[1]+1; i++){
            arr.add(0);
        }

        for(int[] interval : intervals){
            arr.set(interval[0]-range[0], arr.get(interval[0]-range[0])+1);
            arr.set(interval[1]-range[0]+1, arr.get(interval[1]-range[0]+1)-1);
        }

        int curr = 0;
        int ans = 0;
        for(int i : arr){
            curr += i;
            ans = Math.max(ans, curr);
        }
        
        return ans;
    }
}
// @lc code=end

