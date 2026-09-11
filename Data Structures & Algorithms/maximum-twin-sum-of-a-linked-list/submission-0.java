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
    public int pairSum(ListNode head) {
        int size=0;
        ListNode current=head;
        while(current!=null){
            current=current.next;
            size++;
        }
        current=head;
        for(int i=0;i<size/2-1;i++)
            current=current.next;
        current.next=reverseList(current.next);
        displayList(head);
        ListNode mid=current.next;
        current=head;
        int currentSum=0,maxSum=0;
        while(mid!=null){
            currentSum=current.val+mid.val;
            maxSum=Math.max(maxSum,currentSum);
            current=current.next;
            mid=mid.next;
        }
        return maxSum;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null,curr= head,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    private void displayList(ListNode head){
        ListNode current= head;
        while(current!=null){
            System.out.print(current.val);
            if(current.next!=null)
                System.out.print("->");
            current=current.next;
        }
    }
}