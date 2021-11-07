package Double_Linked_List;

public class DLL<T>{

    Node<T> head;

    //Add a node at the front
    public void push(T data) {

        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        newNode.previous = null;

        if (head != null) {

            head.previous = newNode;

        }


        head = newNode;

    }

    //Add a node after a given node
    public void insertAfter(Node<T> previous,T data){

        Node<T> newNode = new Node<>(data);

        newNode.next = previous.next;

        previous.next = newNode;

        newNode.previous = previous;

        if (newNode.next != null){

            newNode.next.previous = newNode;

        }


    }

    //Add a node at the end
    public void append(T data){

        Node<T> newNode = new Node<>(data);

        Node<T> last = head;

        newNode.next = null;

        if (head == null){

            newNode.previous = null;
            head = newNode;

        }else {

            while (last.next != null) {

                last = last.next;

            }

            last.next = newNode;
            newNode.previous = last;

        }

    }


    //Add a node before a given node
    public void insertBefore(Node<T> next,T data){

        Node<T> newNode = new Node<>(data);

        newNode.previous = next.previous;



        next.previous = newNode;
        newNode.next = next;

        if (newNode.previous != null){

            newNode.previous.next = newNode;

        }else {

            head = newNode;

        }

    }


    public void printList(){

        Node<T> current = head;

        while (current != null){

            System.out.print(current.data + " ");
            current = current.next;
        }


    }

    public void printListReversal(){

        Node<T> last = head;

        while (last.next != null){

            last = last.next;

        }

        while (last != null){

            System.out.print(last.data + " ");
            last = last.previous;

        }

    }

    public void delete(Node<T> deleted){

        // If "deleted" is head node
        if (head == deleted){

            head = deleted.next;

        }

        // If "deleted" is not the first node
        if (deleted.previous != null){

            deleted.previous.next = deleted.next;

        }

        // If "deleted" is not the last node
        if (deleted.next != null){

            deleted.next.previous = deleted.previous;

        }


    }

    public T getNth(int index){

        Node<T> target = head;


        for (int i=0;i<index-1;i++){

            target = target.next;

        }

        if (index == 0){

            return head.data;

        }

        return target.next.data;



    }

}
