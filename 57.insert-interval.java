/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0 && newInterval.length == 0){
            int[][] rtn = new int[2][2];
            return rtn;
        }
        if(intervals.length == 0){
            int[][] rtn = new int[1][2];
            rtn[0] = newInterval;
            return rtn;
        } 
        ArrayList<int[]> arr = new ArrayList<>();
        int starting = Integer.MAX_VALUE;
        int ending = 0; 
        boolean update = false;
        for(int[] interval : intervals){
            System.out.println("Starting: " + starting + ", Ending: " + ending);
            if(interval[0]>newInterval[1] || interval[1]<newInterval[0]){
                arr.add(interval);
            }
            else{
                update = true;
                int tmpS = Math.min(interval[0], newInterval[0]);
                starting = Math.min(starting, tmpS);
                int tmpE = Math.max(interval[1], newInterval[1]);
                ending = Math.max(tmpE, ending);
            }

        }
        if(update){
            int[] addInterval = new int[2];
            addInterval[0] = starting;
            addInterval[1] = ending;
            arr.add(addInterval);            
        }
        else{
            arr.add(newInterval);
        }

        int[][] rtn = new int[arr.size()][2];
        for(int i = 0; i<arr.size(); i++){
            rtn[i] = arr.get(i);
        }
        Arrays.sort(rtn, (a, b) -> Integer.compare(a[0], b[0]));
        return rtn;

    }

}
// @lc code=end

