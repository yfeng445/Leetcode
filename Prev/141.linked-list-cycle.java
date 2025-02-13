/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

import java.util.ArrayList;
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> path = new ArrayList<>();
        while(head!=null){
            path.add(head);
            head = head.next;
            if(path.contains(head)){
                return true;
            }
        }
        return false;
        
    }
}
// @lc code=end

