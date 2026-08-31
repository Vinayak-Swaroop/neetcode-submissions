class ListNode {
    int val;
    ListNode next;
}
class MyLinkedList {
    ListNode head;
    ListNode tail;
    int length;
    public MyLinkedList() {}

    public int get(int index) {
        displayList();
        if (index >= length)
            return -1;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr != null ? curr.val : -1;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = new ListNode();
            head.val = val;
            tail = head;
            length++;
            return;
        }
        ListNode newNode = new ListNode();
        newNode.val = val;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode();
        newNode.val = val;
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void addAtIndex(int index, int val) {
        displayList();
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        ListNode newNode = new ListNode();
        newNode.val = val;
        newNode.next = curr.next;
        curr.next = newNode;
        length++;
        if (newNode.next == null)
            tail = newNode;
    }

    public void deleteAtIndex(int index) {
        displayList();
        if (index >= length)
            return;
        ListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next == null) {
            tail = curr;
        }
        length--;
    }
    public void displayList() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */