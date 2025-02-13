/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort the array in ascending order
        int index = 0; 
        
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= index + 1) {
                index++;
            } else {
                break;
            }
        }
        
        return index; // Return the calculated H-index
    }
}

// @lc code=end

