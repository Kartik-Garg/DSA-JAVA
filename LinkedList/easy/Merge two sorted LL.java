// https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //if confused refer to G4G
        //gist is l1 and l2 are used to compare the elements of the lists
        //tail is used to link up the list in the order of sort
        //head is fixed and is returned at the end
        
        //edge cases
        if(list1 == null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        
        //declare vars
        ListNode head = null, tail = null;
        //1st) we make a new head
        if(list1.val<=list2.val){
            head = tail = list1;
            list1 = list1.next;
        }
        else{
            head = tail = list2;
            list2 = list2.next;
        }
        
        while(list1 != null && list2 != null){
            //compare the datas now
            if(list1.val<=list2.val){
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            tail.next = list2;
        }
        else{
            tail.next = list1;
        }
        return head;
    }
}