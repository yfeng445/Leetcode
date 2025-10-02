/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        ArrayList<TreeNode> visited = new ArrayList<>();
        int max = 0;
        int counter = 0;

        if(root == null) return max;
        
        stk.push(root);
        max++;
        counter++;

        while(!stk.isEmpty()){
            TreeNode tmp = stk.peek();
            visited.add(tmp);
            // System.out.println("tmp: " + tmp.val);
            if(tmp.left!=null&&!visited.contains(tmp.left)){
                stk.push(tmp.left);
                counter++;
                max = Math.max(counter, max);
            }
            else if(tmp.right!=null&&!visited.contains(tmp.right)){
                stk.push(tmp.right);
                counter++;
                max = Math.max(counter, max);
            }
            else{
                stk.pop();
                counter--;
            }
        }
        return max;
    }
}
// @lc code=end

