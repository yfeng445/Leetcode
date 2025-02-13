/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(str.length(), minLength);
        }
        for (int i = 0; i < minLength; i++) {
            String strs0 = strs[0].substring(0, i + 1);
            for (String s : strs) {
                if (!s.startsWith(strs0)) return strs0.substring(0, i);
            }
        }
        return strs[0].substring(0, minLength);
    }
}

// @lc code=end

