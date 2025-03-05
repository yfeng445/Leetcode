
import javax.swing.JEditorPane;

/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode rtn = new ListNode();
        ListNode curr = head;
        
        while(curr != null){
            ListNode cpRtn = rtn;
            while(cpRtn.next != null && curr.val > cpRtn.next.val){
                cpRtn = cpRtn.next;
            }
            if(cpRtn.next == null){
                cpRtn.next = new ListNode(curr.val);
            }
            else{
                ListNode tmp = cpRtn.next;
                cpRtn.next = new ListNode(curr.val);
                cpRtn.next.next = tmp;
            }
            curr = curr.next;
            printLink(rtn);
        }
        return rtn.next;
    }

    public void printLink(ListNode h){
        System.out.println();
        while(h!=null){
            System.out.print(h.val);
            h = h.next;
        }
        System.out.println();
    }
}
// @lc code=end

