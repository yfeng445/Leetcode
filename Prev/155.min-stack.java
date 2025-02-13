/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Stack;
class MinStack {

    ArrayList<Integer> stk;

    public MinStack() {
        stk = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stk.add(val);
    }
    
    public void pop() {
        this.stk.remove(stk.size()-1);
    }
    
    public int top() {
        return this.stk.get(stk.size()-1);
    }
    
    public int getMin() {
        int min = stk.get(0);
        for(int i : stk){
            min = Math.min(min, i);
        }
        return min;
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

