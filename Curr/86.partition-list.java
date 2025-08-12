/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode();
        ListNode geDummy   = new ListNode();
        ListNode lt = lessDummy, ge = geDummy;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (cur.val < x) {
                lt.next = cur;
                lt = lt.next;
            } else {
                ge.next = cur;
                ge = ge.next;
            }
        }
        ge.next = null;             
        lt.next = geDummy.next;     
        return lessDummy.next;     
    }
}

// @lc code=end

