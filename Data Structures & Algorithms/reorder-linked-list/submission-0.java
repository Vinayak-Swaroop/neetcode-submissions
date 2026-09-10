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
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<(size-1)/2;i++){
            curr=curr.next;
        }
        curr.next=reverseList(curr.next);
        ListNode mid = curr;
        displayList(head);
        ListNode p1=head,p2=mid.next,next,next2;
        mid.next=null;
        while(p1!=null && p2!=null){
            next=p1.next;next2=p2.next;
            p1.next=p2;
            p2.next=next;
            p1=next;
            p2=next2;
        }

    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    private void displayList(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val);
            if(curr.next!=null)
                System.out.print("->");
            curr=curr.next;
        }
        System.out.println();
    }
}
