/*
 * @lc app=leetcode id=1544 lang=java
 *
 * [1544] Make The String Great
 */

// @lc code=start
import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        Stack<Character> result = new Stack<Character>();
        for(int i = 0; i<s.length(); i++){
            if(result.isEmpty()){
                result.push(s.charAt(i));
            }
            else{
                char top = result.peek();
                if(top!=s.charAt(i)&&
                (String.valueOf(top).toLowerCase().equals(String.valueOf(s.charAt(i)).toLowerCase()))){
                    result.pop();
                }
                else{
                    result.push(s.charAt(i));
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character c : result) {
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

