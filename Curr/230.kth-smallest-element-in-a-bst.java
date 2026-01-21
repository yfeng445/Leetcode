/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    public int kthSmallest(TreeNode root, int k) {
        for(int i = 0; i<k-1; i++){
            root = removeSmallest(root);
        }
        if(root == null) return -1;
        while(root.left != null) root = root.left;
        return root.val;
    }

    public TreeNode removeSmallest(TreeNode root) {
        if (root == null) return null;
        if (root.left == null) return root.right;
        TreeNode parent = root;
        TreeNode curr = root.left;
        while (curr.left != null) {
            parent = curr;
            curr = curr.left;
        }
        parent.left = curr.right;
        return root;
    }
}
// @lc code=end

