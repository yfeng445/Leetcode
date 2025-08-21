/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> arrA = new ArrayList<>();
        ArrayList<ListNode> arrB = new ArrayList<>();
        while(headA != null){
            arrA.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            arrB.add(headB);
            headB = headB.next;
        }
        ListNode intersection = null;
        int cnt = 0;
        while(cnt<=arrA.size()-1 && cnt<=arrB.size()-1){
            if(arrA.get(arrA.size()-1-cnt) == arrB.get(arrB.size()-1-cnt)) intersection = arrA.get(arrA.size()-1-cnt);
            else break;
            cnt++;
        }
        return intersection;
        
    }
}
// @lc code=end

