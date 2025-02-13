/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> inters = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int[] tmp: intervals){
            inters.add(tmp);
        }

        //System.out.println(update(inters));

        while(update(inters) == true){
            update(inters);
        }

        int[][] rtn = new int[inters.size()][2];
        for(int i = 0; i<inters.size(); i++){
            rtn[i] = inters.get(i);
        }

        //System.out.println("!");
        return rtn;

    }

    public boolean update(ArrayList<int[]> input){
        boolean change = false;
        for(int i = 0; i<input.size()-1; i++){
            if(input.get(i)[1]>=input.get(i+1)[0]){
                input.get(i)[1] = Math.max(input.get(i+1)[1], input.get(i)[1]);
                input.remove(i+1);
                change = true;
            }
        }
        return change;
    }
}
// @lc code=end

