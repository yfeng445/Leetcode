


/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int findMinArrowShots(int[][] points) {
        int numArrow = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int[] interval : points){
            for(int i = interval[0]; i<=interval[1]; i++){
                if(map.get(i) == null){
                    map.put(i, 1);
                }
                else{
                    map.put(i, map.get(i)+1);
                }
            }
        }

        System.out.println(map.toString());
        System.out.println(getMaxFreqPos(map));

        //Collections.sort(map, (a, b) -> Integer.compare(, numArrow))
        
        return numArrow;
    }

    public int getMaxFreqPos(HashMap<Integer, Integer> map){
        int maxFreq = 0;
        int maxPos = 0;
        for (HashMap.Entry<Integer, Integer> en : map.entrySet()) {
            if(en.getValue()>maxFreq){
                maxPos = en.getKey();
                maxFreq = en.getValue();
            }
        }
        return maxPos;
    }
}
// @lc code=end

