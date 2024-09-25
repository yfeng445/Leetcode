/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int index = 0;
        while(citations[citations.length-index-1]>=index){
            //System.out.println("index: "+index+", moving left");
            index--;
        }
        return -999;
    }
}
// @lc code=end

