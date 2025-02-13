/*
 * @lc app=leetcode id=214 lang=java
 *
 * [214] Shortest Palindrome
 */

// @lc code=start
class Solution {
    public String shortestPalindrome(String s) {
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(s.length() - j - 1)) {
                i++;
            }
        } 
        if (i == s.length()) {
            return s;
        }
        String p = new StringBuilder(s.substring(i, s.length())).reverse().toString();
        return p + shortestPalindrome(s.substring(0, i)) + s.substring(i);
    }
}
// @lc code=end

