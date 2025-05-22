/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
import java.util.Stack;

class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;
        if(x == Integer.MAX_VALUE) return 0;
        if(x == Integer.MAX_VALUE + 1) return 0;

        Boolean isPositive = x > 0;
        int value = Math.abs(x);
        Stack<Integer> stk = new Stack<>();
        
        while(value != 0){
            stk.push(value%10);
            value = value/10;
        }
        
        int newVal = 0;
        int len = stk.size();
        for(int i = 0; i<stk.size(); i++){
            newVal += stk.get(i)*Math.pow(10, (len-i-1));
            if(newVal < 0 || newVal == Integer.MAX_VALUE) return 0;
        }
        
        return isPositive ? newVal : newVal * (-1);
    }
}
// @lc code=end

