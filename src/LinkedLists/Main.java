package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        LinkedList<Integer> l = new LinkedList<>();

        myLinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        myLinkedList.head.next = second;
        second.next = third;

        myLinkedList.printList();

        myLinkedList.push(0);

        myLinkedList.printList();

        myLinkedList.append(5);

        myLinkedList.printList();

        myLinkedList.insertAfter(myLinkedList.head.next.next.next,4);

        myLinkedList.printList();

        System.out.println(myLinkedList.search(myLinkedList.head, 2));

        myLinkedList.deleteNode(2);

        myLinkedList.printList();

        System.out.println(myLinkedList.getCount() + " --- " + myLinkedList.getCountRecursive(myLinkedList.head));

        myLinkedList.deleteNodeByPosition(1);

        myLinkedList.printList();

        System.out.println(myLinkedList.getCount() + " --- " + myLinkedList.getCountRecursive(myLinkedList.head));

        System.out.println(myLinkedList.search(myLinkedList.head, 2));

        System.out.println(myLinkedList.getNth(2));

        myLinkedList.deleteList();

        myLinkedList.printList();

        System.out.println(myLinkedList.getCount() + " --- " + myLinkedList.getCountRecursive(myLinkedList.head));

    }
}
