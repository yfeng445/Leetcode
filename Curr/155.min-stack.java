/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Stack;

class MinStack {

    Stack<ArrayList<Integer>> minStk;   
    int minVal;

    public MinStack() {
        this.minStk = new Stack<>();
        this.minVal = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(val);
        minVal = val<minVal?val:minVal;
        tmp.add(minVal);
        minStk.push(tmp);
    }
    
    public void pop() {
        ArrayList<Integer> tmp = minStk.pop();
        if(minStk.isEmpty()) minVal = Integer.MAX_VALUE;
        else{
            minVal = tmp.get(1)==minVal?minStk.peek().get(1):minVal;        
        }
    }
    
    public int top() {
        return minStk.peek().get(0);
    }
    
    public int getMin() {
        return minStk.peek().get(1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

