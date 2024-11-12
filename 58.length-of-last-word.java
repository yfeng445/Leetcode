/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.replaceAll("[^a-zA-Z]+$", "").strip().split(" ");
        return str[str.length-1].length();
    }
}
// @lc code=end

