/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> oldNew = new HashMap();
       Map<Node,Node> rand = new HashMap();
       Node current = head;
       Node head2 = new Node(-1);
       Node current2 = head2;
       while(current!=null){
            current2.next = new Node(current.val);
            current2 = current2.next;
            oldNew.put(current,current2);
            rand.put(current2,current.random);
            current=current.next;
       }
       head2=head2.next;
        //displayList(head2);
        rand.forEach((newNode,oldRandom)->{
            if(oldRandom==null){
                newNode.random=null;
                return;
            }
            Node newRandom = oldNew.get(oldRandom);
            newNode.random = newRandom;
        });
        return head2;
    }
    private void displayList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.val);
            if(current.next!=null)
                System.out.print("->");
            current=current.next;
        }
        System.out.println();
    }
}
