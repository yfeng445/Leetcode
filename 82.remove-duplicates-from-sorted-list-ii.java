/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
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

import java.util.ArrayList;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode cpHead = head;
        
        while(head.next!=null){
            System.out.println(head.val);
            boolean flag = false;
            if(head.next.next!=null){
                boolean duplicate = false;
                if(head.next.val == head.next.next.val){
                    duplicate = true;
                    flag = true;
                }
                while(duplicate){
                    System.out.println("DUPLICATE AFTER: " + head.val);
                    head.next = head.next.next;
                    if(head.next.next.next == null || head.next.next.next.val != head.next.next.val) duplicate = false;
                }
            }
            if(!flag) head = head.next;
        }
        return cpHead;
    }
}
// @lc code=end

