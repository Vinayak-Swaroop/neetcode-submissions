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
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while(true){
            int minIndex = findMin(lists);
            if(minIndex == -1)
                break;
            current.next = new ListNode();
            current=current.next;
            current.val = lists[minIndex].val;
            lists[minIndex] = lists[minIndex].next;
        }
        return dummy.next;
    }
    private int findMin(ListNode[] lists){
        ListNode min = null;
        int minIndex = -1;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null && (min==null || lists[i].val<min.val)){
                min = lists[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
