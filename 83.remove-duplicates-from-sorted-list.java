/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
 import java.util.List;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sorted = head;
        while(true){
            if(head == null){
                break;
            }
            if(head.next == null){
                break;
            }
            else{
                if(head.next.val == head.val){
                    if(head.next.next != null){
                        head.next = head.next.next;
                    }
                    else{
                        head.next = null;
                    }
                }
                else{
                   head = head.next; 
                }
            }
        }

        return sorted; 
    }
}            


// @lc code=end

