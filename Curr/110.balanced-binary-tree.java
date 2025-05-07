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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(getSubtreeHeight(root.left)-getSubtreeHeight(root.right) > 1
        || getSubtreeHeight(root.left)-getSubtreeHeight(root.right) < -1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getSubtreeHeight(TreeNode n){
        if(n == null) return 0;
        else return 1 + Math.max(getSubtreeHeight(n.left), getSubtreeHeight(n.right));
    }
}