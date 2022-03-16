//https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //since it is not a tail node,  we can just put next node into this node
        //overwriting that is
        
        node.val = node.next.val;
        node.next = node.next.next;
        
        //basically we are removing the node from the node.next
        //which will be collected using GC in java
    }
}