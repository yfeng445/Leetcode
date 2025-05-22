/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
 */

// @lc code=start

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;

        ListNode start = new ListNode();
        ListNode cpStart = new ListNode();
        start.next = head;
        start.next = uniqueHead(start);

        cpStart.next = uniqueHead(start);

        if(cpStart.next == null){
            // System.out.println("No uniqueHead");
            return null;
        }
        else{
            System.out.println("uniqueHead: " + cpStart.next.val);
            
        }
        
        Boolean duplicate = false;
        while(start.next.next != null){
            // System.out.println("Current: " + start.val);
            if(start.next.val == start.next.next.val){
                start.next = nextDiffNode(start);
                if(start.next == null) return cpStart.next;
            }
            else{
               start = start.next; 
               if(start.next == null) return cpStart.next;
            }
            if(cpStart.next == null) return null;
            
        }
        

        return cpStart.next;
    }

    public ListNode uniqueHead(ListNode start){
        
        if(start.next == null) return null;
        if(start.next.next == null) return start.next;

        Boolean duplicateFlag = (start.next.val == start.next.next.val);
        int duplicateVal = start.next.val;
        while(duplicateFlag){
            while(start.next.val == duplicateVal){
                start = start.next;
                if(start.next == null) return null;
            }
            if(start.next.next == null) return start.next;
            else{
                duplicateFlag = (start.next.val == start.next.next.val);
                duplicateVal = start.next.val;
            } 
        }
        return start.next;
    }

    public ListNode nextDiffNode(ListNode start){
        int duplicateVal = start.next.val;
        while(start.next != null){
            if(start.next.val == duplicateVal) start = start.next;
            else return start.next;
        }
        return null;
    }
}
// @lc code=end

