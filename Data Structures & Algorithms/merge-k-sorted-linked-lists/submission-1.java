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
        ListNode result = new ListNode();
        ListNode current = result;
        while(true){
            int minIndex  = findMin(lists);
            if(minIndex==-1)
                break;
            ListNode list = lists[minIndex];
            current.next=new ListNode();
            current=current.next;
            current.val = list.val;
            lists[minIndex]=lists[minIndex].next;
        }
        return result.next;
    }
    private int findMin(ListNode[] lists){
        int minIndex = -1;
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null)
                continue;
            if(minIndex==-1 || lists[i].val<lists[minIndex].val)
                minIndex=i;
        }
        return minIndex;
    }
}
