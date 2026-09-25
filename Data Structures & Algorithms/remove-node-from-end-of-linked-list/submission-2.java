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
        int size = 0;
        ListNode current = head;
        while(current!=null){
            current=current.next;
            size++;
        }
        current = head;
        if(size-n == 0)
            return head!=null?head.next:null;
        for(int i=0;i<size-n-1;i++)
            current=current.next;
        if(current.next!=null)
            current.next=current.next.next;
        else
            current.next=null;
        return head;
    }
}
