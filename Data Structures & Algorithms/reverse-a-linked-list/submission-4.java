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
    ListNode reverseHead;
    public ListNode reverseList(ListNode head) {
        reverse(head);
        return reverseHead;
    }
    private ListNode reverse(ListNode node){
        if(node==null || node.next==null){
            reverseHead = node;
            return node;
        }
        ListNode temp = reverse(node.next);
        temp.next = node;
        node.next = null;
        return node;
    }
}
