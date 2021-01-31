package LinkedList;

public class DoubleLinkedList {

    class Node {
        Node prev , next;
        int data;

        public Node(int data){
            this.data = data;
            prev = next = null;
        }
     }

     Node head = null;

    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    public void append(int data) {
        Node newNode = new Node(data);

        if(head != null){
            while (newNode.next != null){
                
            }
        }
    }
}
