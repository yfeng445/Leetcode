/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null) return root.right==null;
        if(root.right==null) return root.left==null;
        if(root.left.val!=root.right.val) return false;
        return isSymmI(root.left, root.right);
    }

    private boolean isSymmI(TreeNode left, TreeNode right){
        Deque<TreeNode> lq = new ArrayDeque<>();
        lq.offer(left);
        Deque<TreeNode> rq = new ArrayDeque<>();
        rq.offer(right);

        while(!lq.isEmpty()&&!rq.isEmpty()){
            TreeNode lt = lq.poll();
            TreeNode rt = rq.poll();

            if(lt==null&&rt==null) continue;
            if(lt==null&&rt!=null) return false;
            if(rt==null&&lt!=null) return false;
            // System.out.println()
            if(lt.val!=rt.val) return false;

            if(lt.left!=null){
                if(rt.right==null) return false;
                lq.offer(lt.left);
                rq.offer(rt.right);
            }
            if(lt.left==null&&rt.right!=null) return false;
            if(lt.right!=null){
                if(rt.left==null) return false;
                lq.offer(lt.right);
                rq.offer(rt.left);
            }          
            if(lt.right==null&&rt.left!=null) return false;      
        }

        if(lq.isEmpty()!=rq.isEmpty()) return false;
        return true;
    }
}
// @lc code=end

