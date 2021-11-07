package Lab_Exercises;

public class MyLinkedList<T> {

    Node<T> head;

    // Adds data to the end of the list
    public void add(T data){

        Node<T> newNode = new Node<>(data);

        if (head == null){

            head = new Node<>(data);

        }else{

            newNode.next = null;

            Node<T> last = head;

            while (last.next != null){

                last = last.next;

            }

            last.next = newNode;

        }



    }

    public void printList(){

        Node<T> current = head;

        while (current != null){

            System.out.print(current.data);
            current = current.next;

        }


    }


    public void delete(T data){

        Node<T> current = head;
        Node<T> previous = null;

        if (current != null && current.data == data){

            head = current.next;

        }

        while (current != null && current.data != data){

            previous = current;
            current = current.next;

        }

        if (previous != null && current != null){

            previous.next = current.next;

        }



    }

    public void removeAt(int index){

        Node<T> current = head;

        for(int i=0;i<index-1;i++){

            current = current.next;

        }

        current.next = current.next.next;


    }


    public boolean search(T data){

        Node<T> current = head;

        if (current == null){

            return false;

        }

        while (current.next != null){

            if (current.data == data){

                return true;

            }

            current = current.next;

        }

        assert false;
        return false;

    }

    public void addAt(T data,int index){

        Node<T> current = head;
        Node<T> newNode = new Node<>(data);
        Node<T> previous = null;
        int counter = 0;

        while (current != null){


            if (counter == (index-1)){

                previous = current;
                current = current.next;
                break;

            }

            current = current.next;
            counter++;

        }

        assert previous != null;
        previous.next = newNode;
        newNode.next = current;



    }

    public T getNth(int index){

        Node<T> current = head;

        for (int i=0;i<index;i++){

            current = current.next;

        }

        return current.data;


    }

}
