/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length(); int y = text2.length();
        int[][] dp = new int[x+1][y+1];
        for(int i = 0; i<x+1; i++) dp[i][0] = 0;
        for(int j = 0; j<y+1; j++) dp[0][j] = 0;

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1;
                }
                else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[x][y];
    }
}
// @lc code=end

