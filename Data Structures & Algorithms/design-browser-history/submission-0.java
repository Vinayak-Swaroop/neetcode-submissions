class Node{
    Node prev;
    Node next;
    String val;
    Node(String val){
        this.val = val;
    }
}
class BrowserHistory {
    Node head;
    Node tail;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        tail = head;
    }
    
    public void visit(String url) {
        Node node = new Node(url);
        node.prev=tail;
        tail.next=node;
        tail = tail.next;
        displayList();
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(tail.prev==null)
                break;
            tail=tail.prev;
        }
        displayList();
        return tail.val;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(tail.next==null)
                break;
            tail=tail.next;
        }
        displayList();
        return tail.val;
    }
    public void displayList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */