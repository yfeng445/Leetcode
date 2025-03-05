/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if((head.next == null && n!=0)||(head==null)) return null;
        ListNode cpHead = new ListNode();
        cpHead.next = head;
        try {
            for(int i = 0; i<n; i++){
                cpHead = cpHead.next;
            }
        } catch (Exception e) {
            return head;
        }

        ListNode next = head;
        ListNode prev = new ListNode();
        ListNode rm = new ListNode();
        rm.next = head;
        prev.next = rm;

        while(cpHead != null){
            next = next.next;
            prev = prev.next;
            rm = rm.next;
            cpHead = cpHead.next;
        }

        prev.next = next;

        return head.equals(rm)? head.next:head;
    }
}
// @lc code=end

