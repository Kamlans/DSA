package Stack;

public class stack {

  public static class StackUsingLinkedList {
    static class Node {
        int data;
        Node link;

        Node ( int e) {
            data = e;
            link = null;
        }
    }

    Node head  ;


    private int count;

    public void append ( int ele) {
        Node temp = head;
        Node newNode = new Node(ele);

        if ( head == null){
            head = newNode;
            return;
        }

        while ( temp.link != null) {
            temp = temp.link;
        }

        temp.link = newNode;


    }



    public  void  delete( ) {

        Node temp = head;
        Node prev = null;

        while ( temp.link != null) {
            prev = temp;
            temp= temp.link;
        }
        prev.link = null;
    }

    public void  print( ) {
        Node temp = head;
        while ( temp!= null){
            System.out.print(temp.data +" ");
            temp = temp.link;
            count++;
        }
    }
      public void  length(){
          System.out.println( "\n" +count);
      }



    }
}