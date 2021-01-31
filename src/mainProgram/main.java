package mainProgram;

import LinkedList.DoubleLinkedList;
import LinkedList.linkedList;
import Queue.queue;
import Queue.queueWithArray;
import Stack.stack;



public class main {

     static linkedList.LinkedlistUsingArray ll = new linkedList.LinkedlistUsingArray();
     static stack.StackUsingLinkedList stk = new stack.StackUsingLinkedList();
     static queue qu = new queue();
     static queueWithArray qa = new queueWithArray();
     static DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

    public static void main(String[] args) {

    linkedListfunc();
    Stackfunc();
    Qfunc();


    }

    public static void linkedListfunc() {
        System.out.println("LInked list:");
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.append(5);

        ll.delete(2);
        ll.print();
        ll.length();
        System.out.println();
        System.out.println();

    }

    public static void Stackfunc () {
        System.out.println("stack: ");
        stk.append(1);
        stk.append(2);
        stk.append(3);
        stk.append(4);
        stk.append(5);
        stk.append(6);
        stk.append(7);
        stk.delete();
        stk.delete();
        stk.print();
        System.out.println();
        System.out.println();
    }

    public static void Qfunc() {
        System.out.println("Queue : ");
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.delete();
        qu.delete();
        qu.print();
        System.out.println();
        System.out.println();
    }

    public  static void queueWithArray (){

    }

    public static void DoubleLinkedList() {
        System.out.println("Double Linked List ");

        doubleLinkedList.push(5);

    }
    
}

