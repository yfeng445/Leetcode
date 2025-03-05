

/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        if(head.next == null || k == 0) return head;



        ListNode tmp = new ListNode();
        tmp = head;
        int count = 0;
        while(tmp!= null){
            count++;
            tmp = tmp.next;
        }
        int moveStep = count-(k%count);

        ListNode pointer = head;
        for(int i = 0; i<moveStep-1; i++){
            if(pointer.next == null){
                pointer = head;
            } 
            else{
                pointer = pointer.next; 
            }
        }
        
        ListNode newHead = pointer.next == null ? head:pointer.next;
        System.out.println("Pointer: " + pointer.val + ", newHead: " + newHead.val);

        if(newHead == null) return head;
        ListNode cp = pointer;
        while(pointer.next != null){
            pointer = pointer.next;
        }

        pointer.next = head;
        cp.next = null;

        return newHead;
    }
}
// @lc code=end

