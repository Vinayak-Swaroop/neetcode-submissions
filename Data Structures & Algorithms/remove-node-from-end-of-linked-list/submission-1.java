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
        int size=0;
        ListNode curr = head;
        while(curr!=null){
            size+=1;
            curr=curr.next;
        }
        int index = size-n;
        if(index==0 && size==1)
            return null;
        else if(index==0){
            head=head.next;
            return head;
        }
        curr=head;
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
