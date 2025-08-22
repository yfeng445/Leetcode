/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }

        int left = 0, right = arr.size()-1;

        while(left<right){
            if(arr.get(left)!=arr.get(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
// @lc code=end

