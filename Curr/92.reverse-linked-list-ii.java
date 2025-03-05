/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.ArrayList;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cpHead = new ListNode();
        ArrayList<ListNode> arr = new ArrayList<>();
        cpHead.next = head;
        for(int i = 0; i<left-1; i++){
            cpHead = cpHead.next;
        }

        ListNode start = cpHead;
        cpHead = cpHead.next;
        
        for(int i = left; i<=right; i++){
            arr.add(cpHead);
            cpHead = cpHead.next;
        }

        arr.get(0).next = cpHead;
        start.next = arr.get(arr.size()-1);

        for(int i = arr.size()-1; i>0; i--){
            arr.get(i).next = arr.get(i-1);
        }

        if(left == 1){
            head = arr.get(arr.size()-1);
        }

        return head;
        
    }
}
// @lc code=end

