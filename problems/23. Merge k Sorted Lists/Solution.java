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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for(ListNode node : lists){
            ListNode current = node;
            ListNode next;
            while(current != null){
                next = current.next;
                result = sortedInsert(result, current);
                current = next;
            }
        }
        return result;
    }
    
    public static ListNode sortedInsert(ListNode head, ListNode newNode) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        dummy.next = head;
 
        while (current.next != null && current.next.val < newNode.val) {
            current = current.next;
        }
 
        newNode.next = current.next;
        current.next = newNode;
        return dummy.next;
    }
}