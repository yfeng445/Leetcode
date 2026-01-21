/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        List<TreeNode> visited = new ArrayList<TreeNode>();
        if(root == null) return ans;

        stk.push(root);
        ans.add(root.val);
        visited.add(root);
        int mx_height = stk.size();

        while(!stk.isEmpty()){
            TreeNode curr = stk.peek();
            if(curr.right !=null && !visited.contains(curr.right)){
                stk.push(curr.right);
                visited.add(curr.right);
                if(stk.size() > mx_height){
                    ans.add(stk.peek().val);
                    mx_height = stk.size();
                }
            }
            else if(curr.left !=null && !visited.contains(curr.left)){
                stk.push(curr.left);
                visited.add(curr.left);
                if(stk.size() > mx_height){
                    ans.add(stk.peek().val);
                    mx_height = stk.size();
                }
            }
            else{
                stk.pop();
            } 
            // System.out.println(ans + ", H: " + mx_height);
        }

        return ans;
    }
}
// @lc code=end

