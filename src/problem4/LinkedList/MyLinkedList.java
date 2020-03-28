package problem4.LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;

    private void addLast(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.setNext(node);
        tail = node;
    }

    public void deleteFirst() {
        if (head == null) {
            head = tail = null;
            return;
        }
        var second = head.getNext();
        head.setNext(null);
        head = second;
    }

    public void display() {
        var current = head;
        while (current != null) {
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }
    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public void setHead(Node head){
        this.head = head;
    }
    public void setTail(Node tail){
        this.tail = tail;
    }
}
