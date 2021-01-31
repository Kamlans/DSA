package Queue;

public class queue {


    static class Node {
        int data;
        Node link;

        Node(int ele) {
            data = ele;
            link = null;
        }
    }
        Node head = null;
        int count = 0;


        public void add (int ele) {
            Node newNode = new Node(ele);
            Node temp = head;

            if ( head == null) {
                head = newNode;
                return;
            }

            while ( temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }

        public void delete () {
            Node temp = head;
            head =temp.link;
        }

        public void print( ) {
            Node temp = head;
            while ( temp != null){

                System.out.print(temp.data +" ");
                temp = temp.link;
                count++;
            }
        }

        public void  length(){
            System.out.println( "\n" +count);
        }
    }

