// https://leetcode.com/problems/reverse-linked-list/

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
    public ListNode reverseList(ListNode head) {
        
        //simple approach
        //if stuck use G4G
        //we use three vars, prev, cur and next
        //keep changing cur.next to prev instead of curr=curr.next,
        //simplee
        
        ListNode prev = null;
        ListNode curr = head;
        
        //iterate till curr is null, so we can return prev as new head
        while(curr!=null){
            //keep a next var so we dont loose the links for LLs
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //at end next and curr are both at the null and we have prev at
        //the last node, so we return prev as the new head
        return prev;
    }
}