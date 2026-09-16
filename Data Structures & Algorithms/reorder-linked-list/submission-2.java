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
    public void reorderList(ListNode head) {
        int size=0;
        ListNode current = head;
        while(current!=null){
            size+=1;
            current=current.next;
        }
        int mid=(size-1)/2;
        current=head;
        for(int i=0;i<mid;i++){
            current=current.next;
        }
        current.next=reverseList(current.next);
        ListNode l1=head,l2=current.next,next1,next2;
        current.next=null;
        while(l1!=null && l2!=null){
            next1=l1.next;
            next2=l2.next;
            l1.next=l2;
            l2.next=next1;
            l1=next1;
            l2=next2;
        }
    }
    private ListNode reverseList(ListNode node){
        ListNode prev=null,curr=node,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
