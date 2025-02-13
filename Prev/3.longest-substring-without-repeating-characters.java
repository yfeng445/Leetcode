/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Queue<Character> subStr = new LinkedList<>();

        char[] charArr = s.toCharArray();
        for(int i = 0; i<charArr.length; i++){
            while(subStr.contains(charArr[i])){
                subStr.poll();
            }
            subStr.add(charArr[i]);
            maxLen = Math.max(maxLen, subStr.size());

            System.out.println("Curr Str: " + subStr.toString() + " | maxLen=" + maxLen);
        }
        return maxLen;
    }
}
// @lc code=end

