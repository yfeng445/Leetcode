/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : a){
            if(st.isEmpty()){
                st.push(c);
            }
            else{
                if((st.peek() == '(' && c == ')')||
                (st.peek() == '[' && c == ']')||
                (st.peek() == '{' && c == '}')){
                st.pop(); 
                }
                else{
                    st.push(c);
                }                 
            } 
        }
        return st.isEmpty();
    }
}
// @lc code=end

