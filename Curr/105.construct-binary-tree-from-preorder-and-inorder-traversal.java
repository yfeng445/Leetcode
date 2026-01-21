/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
import java.util.*;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> st = new ArrayDeque<>();
        st.push(root);

        int inIdx = 0;

        for (int preIdx = 1; preIdx < preorder.length; preIdx++) {
            int val = preorder[preIdx];
            TreeNode node = st.peek();

            // Still building left chain
            if (node.val != inorder[inIdx]) {
                node.left = new TreeNode(val);
                st.push(node.left);
            } 
            // Close completed nodes, then attach right
            else {
                while (!st.isEmpty() && st.peek().val == inorder[inIdx]) {
                    node = st.pop();
                    inIdx++;
                }
                node.right = new TreeNode(val);
                st.push(node.right);
            }
        }
        return root;
    }
}

// @lc code=end

