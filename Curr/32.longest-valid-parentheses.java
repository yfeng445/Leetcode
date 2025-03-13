/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } 
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } 
                else {
                    max_len = max_len > (i-stack.peek()) ? max_len : (i-stack.peek());
                }
            }
        }

        return max_len;        
    }
}
// @lc code=end

