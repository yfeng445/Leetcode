\/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;

        Queue<Node> currQueue = new ArrayDeque<Node>();
        Queue<Node> nextQueue = new ArrayDeque<Node>();
        currQueue.offer(root);

        while(currQueue.size() != 0){
            while(currQueue.size() > 0){
                Node curr = currQueue.poll();
                if(curr.left != null && curr.right != null){
                    nextQueue.offer(curr.left);
                    nextQueue.offer(curr.right);                    
                }
                curr.next = currQueue.peek();
            }

            currQueue = nextQueue;
            nextQueue = new ArrayDeque<Node>();        
        }

        return root;
    }
}