/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        // null
        if(head == null) return null;

        // head is val
        while(head.next!=null){
            if(head.val!=val) break;
            else head = head.next;
        }
        if(head.val == val) return null;

        if(head.next == null){
            if(head.val == val)return null;
            else return head;
        }  
        

        ListNode cpHead = head;

        while(head.next != null){
            if(head.next.next == null){
                if(head.next.val == val) head.next = null;
                break;
            }
            else{
                if(head.next.val == val){
                    head.next = head.next.next;
                }
                else{
                   head = head.next;  
                }
            }           
        }
        
        return cpHead;
    }
}
// @lc code=end

