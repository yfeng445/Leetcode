/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        String mxSubstring = "";
        for(int i = 0; i<s.length(); i++){
            String singleStr = checkSingle(i, s);
            String doubleStr = checkDouble(i, s);
            mxSubstring = mxSubstring.length() > singleStr.length() ? mxSubstring : singleStr;
            mxSubstring = mxSubstring.length() > doubleStr.length() ? mxSubstring : doubleStr;
            
        }
        return mxSubstring;
    }

    public String checkSingle(int position, String s){
        int left = position - 1;
        int right = position + 1;
        while(left>=0 && right<s.length()){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            else{
                left--;
                right++;
            }
        }
        return s.substring(left + 1, right);
    }

    public String checkDouble(int position, String s){
        if(position == s.length()-1) return "";
        if(s.charAt(position) != s.charAt(position+1)) return "";
        int left = position - 1;
        int right = position + 2;
                while(left>=0 && right<s.length()){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            else{
                left--;
                right++;
            }
        }
        return s.substring(left + 1, right);
    }
}
// @lc code=end

