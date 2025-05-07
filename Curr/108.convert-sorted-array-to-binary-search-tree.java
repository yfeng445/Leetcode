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

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
        return insertNode(nums, 0, nums.length-1);
    }

    public TreeNode insertNode(int[] nums, int left, int right){
        if(left > right) return null;
        TreeNode root = new TreeNode(nums[(left + right)/2]);
        root.left = insertNode(nums, left, (left + right)/2 - 1);
        root.right = insertNode(nums, (left + right)/2+1, right);
        return root;
    }
}