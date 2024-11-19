/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arrS = s.toCharArray();
        for(char c:arrS){
            if(!t.contains(String.valueOf(c))) return false;
        }

        char[] arrT = t.toCharArray();
        int pos = 0;
        for(char c:arrS){
            System.out.println("Starting pos = "+pos);
            for(;;pos++){
                if(pos == arrT.length) return false;
                if(c == arrT[pos]){
                    pos++;
                    break;
                }
            }          
        }
        return true;
    }
}
// @lc code=end

