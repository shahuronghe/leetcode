import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        
        int carry = 0;
        while (l1!=null || l2!=null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            int total = val1 + val2 + carry;
            
            
            carry = total / 10;
            
            int last_digit = total % 10;
            
            ListNode node = new ListNode(last_digit);
            current.next = node;
            current = current.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        
        if(carry > 0){
            ListNode node = new ListNode(carry);
            current.next = node;
            current = current.next;
        }
        
        return temp.next;
    }
  
}