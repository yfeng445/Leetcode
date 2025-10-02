/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rtn = new ArrayList<>();
        Deque<TreeNode> nodes = new ArrayDeque<>();
        if(root==null) return rtn;
        nodes.add(root);

        while(!nodes.isEmpty()){
            Deque<TreeNode> tmp = new ArrayDeque<>();
            List<Integer> lvl = new ArrayList<>();
            while(!nodes.isEmpty()){
                TreeNode n = nodes.poll();
                lvl.add(n.val);
                if(n.left!=null) tmp.offer(n.left);
                if(n.right!=null) tmp.offer(n.right);
            }
            nodes = tmp;
            rtn.add(lvl);
        }

        return rtn;
    }
}
// @lc code=end

