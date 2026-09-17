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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;
        Queue<ListNode> queue = new ArrayDeque();
        for(ListNode list:lists){
            if(list!=null) queue.add(list);
        }
        while(queue.size()>1){
            ListNode l1 = queue.poll();
            ListNode l2 = queue.poll();
            queue.add(mergeLists(l1,l2));
        }
        return queue.poll();
    }
    private ListNode mergeLists(ListNode l1,ListNode l2){
        ListNode result = new ListNode();
        ListNode current=result;
        while(l1!=null && l2!=null){
            current.next=new ListNode();
            current = current.next;
            if(l1.val<=l2.val){
                current.val=l1.val;
                l1=l1.next;
            }
            else{
                current.val=l2.val;
                l2=l2.next;
            }
        }
        while(l1!=null){
            current.next=new ListNode();
            current=current.next;
            current.val=l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            current.next=new ListNode();
            current=current.next;
            current.val=l2.val;
            l2=l2.next;
        }
        return result.next;
    }
}
