package LinkedList;

public class linkedList {

    public static class LinkedlistUsingArray {
        int count;

        static class Node {
            int data;
            Node next;

            Node( int d){
                data = d;
                next = null;
            }
        }
        Node head;

        public void push(int ele) {
            Node newNode = new Node(ele);
            newNode.next = head;
            head = newNode;
        }

        public void print() {
            Node n = head;
            count= 0;
            while ( n != null) {
                System.out.print(n.data +" ");
                n= n.next;
                count++;
            }
        }

        public void  length(){
            System.out.println( "\n" +count);
        }

        public void append(int ele) {
            Node newNode = new Node(ele);
            if ( head == null) {
                head = newNode;
                return;
            }

            newNode.next = null;

            Node temp = head;

            while ( temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }

        public void delete(int ele) {
            Node newNode = new Node(ele);
            Node temp = head , prev = null;

            if ( head == null) {
                System.out.println(" \nelement not present \n");
            }
            else {
                if (temp.next!= null && temp.data == ele ) {
                    head = temp.next;
                    return;
                }
                while(temp.next!= null && temp.data != ele ) {
                    prev = temp;
                    temp = temp.next;
                }
                assert prev != null;
                prev.next = temp.next;

            }
        }

        void deleteNode ( int pos) {

        }
    }

}
