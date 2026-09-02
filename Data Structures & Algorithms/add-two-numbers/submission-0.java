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
        int sum = 0, carry = 0;
        ListNode result = new ListNode();
        ListNode current = result;
        while (l1 != null && l2 != null) {
            current.next = new ListNode();
            current = current.next;
            sum = carry + l1.val + l2.val;
            carry = sum / 10;
            sum %= 10;
            current.val = sum;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            current.next = new ListNode();
            current = current.next;
            sum = carry + l1.val;
            carry = sum / 10;
            sum %= 10;
            current.val = sum;
            l1 = l1.next;
        }
        while (l2 != null) {
            current.next = new ListNode();
            current = current.next;
            sum = carry + l2.val;
            carry = sum / 10;
            sum %= 10;
            current.val = sum;
            l2 = l2.next;
        }
        if (carry > 0){
            current.next=new ListNode();
            current = current.next;
            current.val = carry;
        }
        return result.next;
    }
}
