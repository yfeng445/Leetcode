/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        int mxRoot = mxDepth(root.left) + mxDepth(root.right);
        int mxSub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        // System.out.println("curr: " + root.val + ", mxRoot: " + mxRoot +", mxSub: " + mxSub);
        return Math.max(mxRoot, mxSub);
    }

    public int mxDepth(TreeNode root){
        if(root == null) return 0;
        else return Math.max(mxDepth(root.left), mxDepth(root.right))+1;
    }
}
// @lc code=end

