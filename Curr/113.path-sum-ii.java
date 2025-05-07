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
 
     List<List<Integer>> sol = new ArrayList<>();
     ArrayList<TreeNode> visited = new ArrayList<>();
     Stack<TreeNode> path = new Stack<>();
     int pathSum = 0;
     
     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         if(root == null) return sol;
         pushNode(root);
         while(!path.isEmpty()){
             if(path.peek().left == null && path.peek().right == null && pathSum == targetSum){
                 sol.add(savePath());
                 popNode();
             }
             else if((path.peek().left == null || visited.contains(path.peek().left))
             && (path.peek().right == null || visited.contains(path.peek().right))){
                 popNode();
             }
             else if(!(path.peek().left == null || visited.contains(path.peek().left))
             && (path.peek().right == null || visited.contains(path.peek().right))){
                 pushNode(path.peek().left);
             }
             else if((path.peek().left == null || visited.contains(path.peek().left))
             && !(path.peek().right == null || visited.contains(path.peek().right))){
                 pushNode(path.peek().right);
             }
             else{
                 pushNode(path.peek().left);
             }
         }
 
         return sol;
     }
 
     public void pushNode(TreeNode n){
         visited.add(n);
         pathSum += n.val;
         path.push(n);
     }
 
     public void popNode(){
         if(path.isEmpty()){
             System.out.println("NULL STACK");
             return;  
         } 
         pathSum -= path.pop().val;
         return;
     }
 
     public List<Integer> savePath(){
         List<Integer> pth = new ArrayList<Integer>();
         for(TreeNode n : path){
             pth.add(n.val);
         }
         return pth;
     }
 
 }