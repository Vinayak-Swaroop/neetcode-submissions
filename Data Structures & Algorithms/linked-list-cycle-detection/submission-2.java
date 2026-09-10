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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(true){
            if(slow==null || fast==null || fast.next==null)
                return false;
            if(slow!=null)
                slow=slow.next;
            if(fast!=null && fast.next!=null)
                fast=fast.next.next;
            if(slow==fast)
                return true;
        }
    }
}
