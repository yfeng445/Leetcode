/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
import java.util.Stack;
import java.util.ArrayList;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<Integer>();
        
        for(String s : tokens){
            if(s.equals("+")){
                int v1 = stk.pop();
                int v2 = stk.pop();
                stk.push(v1+v2);
            }
            else if(s.equals("-")){
                int v1 = stk.pop();
                int v2 = stk.pop();
                stk.push(v2-v1);
            }
            else if(s.equals("*")){
                int v1 = stk.pop();
                int v2 = stk.pop();
                stk.push(v2*v1);
            }
            else if(s.equals("/")){
                int v1 = stk.pop();
                int v2 = stk.pop();
                stk.push(v2/v1);
            }
            else{
                stk.push(Integer.valueOf(s));
            }
        }
        return stk.pop();
    }
}
// @lc code=end

