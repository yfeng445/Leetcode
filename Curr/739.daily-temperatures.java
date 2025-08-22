/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temps) {
    int[] ans = new int[temps.length];
    Stack<Integer> stack = new Stack<>();
    for (int i = temps.length - 1; i >= 0; i--) {
        while (!stack.isEmpty() && temps[i] >= temps[stack.peek()]) {
            stack.pop();
        }
        ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
        stack.push(i);
    }
    return ans;
    }
}
// @lc code=end

