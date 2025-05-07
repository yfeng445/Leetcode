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

 import java.util.Stack;
 import java.util.ArrayList;
 
 class Solution {
 
     int pathSum = 0;
     ArrayList<TreeNode> visited = new ArrayList<>();
     Stack<TreeNode> path = new Stack<>();
 
     public boolean hasPathSum(TreeNode root, int targetSum) {
 
         if(root == null) return false;
 
         pushNode(root);
 
         while(!path.isEmpty()){
 
             if(pathSum == targetSum 
             && path.peek().left == null 
             && path.peek().right == null) return true;
 
             if((path.peek().left == null || visited.contains(path.peek().left)) 
             && (path.peek().right == null || visited.contains(path.peek().right))){ // leaf node
                 popNode();
             }
 
             else if(path.peek().left == null || visited.contains(path.peek().left)){
                 pushNode(path.peek().right);
             }
 
             else if(path.peek().right == null || visited.contains(path.peek().right)){
                 pushNode(path.peek().left);
             }
 
             else{ // non-leaf, both nodes are available
                 pushNode(path.peek().left);
             }
             
         }
 
         return false;
         
     }
 
     public void pushNode(TreeNode n){
         this.pathSum += n.val;
         path.push(n);
         if(!visited.contains(n)) visited.add(n);
     }
 
     public void popNode(){
         this.pathSum -= path.pop().val;
     }
 }