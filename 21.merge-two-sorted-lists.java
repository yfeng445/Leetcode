/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode rtn = head;
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        while(list1 != null && list2 != null){
            if(list1.val <=list2.val){
                head.next = new ListNode();
                head = head.next;
                head.val = list1.val;
                list1 = list1.next;
            }
            else{
                head.next = new ListNode();
                head = head.next;
                head.val = list2.val;
                list2 = list2.next;
            }
        }
        if(list1 == null && list2 != null){
            while(list2 != null){
                head.next = new ListNode();
                head = head.next;
                head.val = list2.val;
                list2 = list2.next;                
            }
        }
        else if(list2 == null && list1 != null){
            while(list1 != null){
                head.next = new ListNode();
                head = head.next;
                head.val = list1.val;
                list1 = list1.next;                
            }

        }

        return rtn.next;
    }
}
// @lc code=end

