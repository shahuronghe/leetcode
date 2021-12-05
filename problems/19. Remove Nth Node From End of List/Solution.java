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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        size = size - n;
        temp = dummy;
        while(size > 0){
            temp = temp.next;
            size--;
        }
        temp.next = temp.next.next;
        //System.out.print(temp.val);
        return dummy.next;
    }
}