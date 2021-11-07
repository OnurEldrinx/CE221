package LinkedLists;

public class MyLinkedList {

    // First node in the list
    Node head;

    public void printList(){

        Node n = this.head;

        while (n != null){

            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println();

    }

    // Add a new node at front of the list
    public void push(int data){

        Node newHead = new Node(data);

        newHead.next = head;
        head = newHead;

    }

    // Add a new node after a given node
    public void insertAfter(Node previousNode,int data){

        if (previousNode == null){

            System.out.println("Previous node can not be null");

        }else{

            Node newNode = new Node(data);
            newNode.next = previousNode.next;
            previousNode.next = newNode;

        }

    }

    // Add a new node at the end of the list
    public void append(int data){

        Node newNode = new Node(data);

        if (head == null){

            head = new Node(data);

        }else{

            newNode.next = null;

            Node last = head;

            while (last.next!=null){

                last = last.next;

            }

            last.next = newNode;


        }


    }

    public void  deleteNode(int key){

        Node previousNode,temp;

        temp = head;
        previousNode = null;

        if (temp != null && temp.data == key){

            head = temp.next;

        }

        while (temp != null && temp.data != key){

            previousNode = temp;
            temp = temp.next;

        }

        if (previousNode != null && temp != null){

            previousNode.next = temp.next;

        }

    }

    public void deleteNodeByPosition(int position){

        Node temp = head;

        if (head == null){

            System.out.println("List is empty.");

        }else {

            if (position == 0) {

                head = temp.next;

            }

                for (int i=0;i<position-1;i++){

                    temp = temp.next;

                }

            temp.next = temp.next.next;


        }
    }

    public void deleteList(){

        head = null;

    }

    public int getCount(){

        Node temp = head;
        int counter=0;

        while(temp != null){

            counter++;
            temp = temp.next;

        }

        return counter;

    }

    public int getCountRecursive(Node node){

        if (node == null){

            return 0;

        }

        return 1 + getCountRecursive(node.next);

    }

    public boolean search(Node node,int data){

        if (node == null){

            return false;

        }

        if (node.data == data){

            return true;

        }

        return search(node.next,data);

    }

    public int getNth(int index){

        Node current = head;
        int counter = 0;

        while (current != null){

            if (counter == index){

                return current.data;

            }
            counter++;
            current = current.next;

        }

        assert false;
        return 0;

    }



}



