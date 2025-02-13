/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] str = s.strip().replaceAll(" +", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1; i>=0; i--){
            sb.append(str[i].replace(" ", ""));
            sb.append(" ");
        }
        return sb.toString().strip();
    }
}
// @lc code=end

