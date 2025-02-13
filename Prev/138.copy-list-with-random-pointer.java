/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Integer, Stack<Node>> map = new HashMap<Integer, Stack<Node>>();
        Node copyHead = head;
        Node newHead = new Node(head.val);
        Node copyNewHead = newHead;
        Node rtn = newHead;
        Stack<Node> tmp = new Stack<Node>();
        tmp.push(head.random);
        map.put(head.val, tmp);
        while(head.next != null){
            head = head.next;
            if(map.get(head.val) == null){
                tmp = new Stack<Node>();
                tmp.push(head.random);
                map.put(head.val, tmp);
            }
            else{
                tmp = map.get(head.val);
                tmp.push(head.random);
                map.put(head.val, tmp);
            }
            newHead.next = new Node(head.val);
            newHead = newHead.next;
        }

        copyNewHead.random = map.get(copyHead.val).pop();
        while(copyHead.next != null){
            copyHead = copyHead.next;
            if(map.get(copyHead.val).peek() == null) map.get(copyHead.val).pop();
            else{
                copyNewHead.random = new Node(map.get(copyHead.val).pop().val);                
            }

            if(copyNewHead.random != null){
                System.out.println(copyNewHead.val + ", " + copyNewHead.random.val);
            }
            else{
                System.out.println(copyNewHead.val + ", null");
            }

            copyNewHead = copyNewHead.next;
        }

        return rtn;
    }
}
// @lc code=end

