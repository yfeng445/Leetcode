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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode fakeHead = new ListNode();
        ListNode rtn = fakeHead;
        fakeHead.next = head;
  
        while(fakeHead.next.next != null){
            if(fakeHead.next.val == fakeHead.next.next.val){
                ListNode tmp = fakeHead.next;
                boolean update = false;
                while(tmp.next != null){
                    if(tmp.val != tmp.next.val){
                        fakeHead.next = tmp.next;
                        update = true;
                        break;
                    }
                    tmp = tmp.next;
                }
                if(!update){ // end with series of same value
                    fakeHead.next = null;
                    return rtn.next;
                }
            }
            else{
               fakeHead = fakeHead.next; 
            }   
        }
        return rtn.next;
    }
}
// @lc code=end

