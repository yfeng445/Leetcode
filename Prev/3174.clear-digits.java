/*
 * @lc app=leetcode id=3174 lang=java
 *
 * [3174] Clear Digits
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
class Solution {
    public String clearDigits(String s) {
        char[] arr = s.toCharArray();
        //System.out.println(Arrays.toString(arr));
        String digits = "0123456789";
        Stack<Character> stk = new Stack<>();
        for(char c : arr){
            //System.out.println(stk.toString());
            if(digits.indexOf(c) == -1){
                stk.push(c);
            }
            else{
                if(!stk.isEmpty()){
                 stk.pop();   
                }  
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(char c : stk){
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

