// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
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
    public int getDecimalValue(ListNode head) {
        //naive approach would be to traverse it and store data in String
        //and then convert that to a decimal
        
        ListNode curr = head;
        String data = "";
        while(curr!=null){
            data += curr.val;
            curr = curr.next;
        }
        return (Integer.parseInt(data,2));
    }
}