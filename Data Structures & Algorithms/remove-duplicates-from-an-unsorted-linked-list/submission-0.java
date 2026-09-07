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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer,Integer> frequency = new HashMap();
        ListNode current = head;
        while(current!=null){
            frequency.putIfAbsent(current.val,0);
            frequency.put(current.val,frequency.get(current.val)+1);
            current=current.next;
        }
        Set<Integer> elementsToDelete = new HashSet();
        frequency.forEach((num,numFrequency)->{
            if(numFrequency>1)
                elementsToDelete.add(num);
        });
        ListNode prev = null,next;current = head;
        while(current!=null){
            next = current.next;
            if(elementsToDelete.contains(current.val)){
                if(prev==null){
                    current = current.next;
                    head=head.next;
                    continue;
                }
                prev.next=next;
                current = next;
                continue;
            }
            prev=current;
            current = next;
        }
        return head;
    }
}
