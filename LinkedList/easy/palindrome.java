// https://leetcode.com/problems/palindrome-linked-list/
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
        //first we find middle
        //reverse after the middle point
        //increase from head and after the midd
        //keep checking if same or diff
        //if diff break if same keep going
        
        //1) finding middle
        ListNode slow = head, fast = head;
        //ps: in palindrome we always take the first middle element 
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow gives the first half
        //2) reverse it
        ListNode rev = revNode(slow.next); 
        
        //now compare prev with starting and keep moving up from here
        while(rev!=null){
            if(rev.val!=head.val){
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
    public ListNode revNode(ListNode head){
        //reversing and returning it
        // we need three vars
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            //we will get curr as null so prev can be head of reversed LL
            //keep track of nodes in front also
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}