/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(dfs(p, q)) return p;
        if(dfs(q, p)) return q;
        
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode lca = root;

        while(dfs(lca, p) && dfs(lca, q)){
            if(dfs(lca.left, p) && dfs(lca.left, q)) lca = lca.left;
            else if(dfs(lca.right, p) && dfs(lca.right, q)) lca = lca.right;
            else break;
        }

        return lca;
    }

    public boolean dfs(TreeNode root, TreeNode t){
        if(root == t) return true;
        if(root == null) return false;
        else return dfs(root.left, t)||dfs(root.right, t);
    }
}
// @lc code=end

