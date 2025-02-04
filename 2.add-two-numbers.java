/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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

import java.util.Arrays;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode rtn = head;
        int overflow = 0;
        while(l1 != null && l2 !=null){
            head.next = new ListNode();
            head = head.next;
            head.val = (l1.val + l2.val + overflow)%10;
            overflow = (l1.val + l2.val + overflow)/10;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null && l2 != null){
            while(l2 != null){
                head.next = new ListNode();
                head = head.next;
                head.val = (l2.val + overflow)%10;
                overflow = (l2.val + overflow)/10;
                
                l2 = l2.next;
            }
        }
        else if(l2 == null && l1 != null){
            while(l1 != null){
                head.next = new ListNode();
                head = head.next;
                head.val = (l1.val + overflow)%10;
                overflow = (l1.val + overflow)/10;
                
                l1 = l1.next;
            }
        }
        if(overflow == 1){
            head.next = new ListNode();
            head = head.next;
            head.val = 1;
        }
        return rtn.next;
    }
}
// @lc code=end

