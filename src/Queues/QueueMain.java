package Queues;

public class QueueMain {
    public static void main(String[] args) {

        SingleQueueArray<Integer> myQ = new SingleQueueArray<>();

        System.out.println(myQ.isEmpty());
        System.out.println(myQ.isFull());

        myQ.print();

        System.out.println();

        myQ.enqueue(2);
        myQ.enqueue(0);
        myQ.enqueue(2);
        myQ.enqueue(0);
        myQ.enqueue(0);
        myQ.enqueue(6);
        myQ.enqueue(0);
        myQ.enqueue(2);
        myQ.enqueue(0);
        myQ.enqueue(3);
        myQ.enqueue(6);

        myQ.print();

        System.out.println(myQ.isEmpty());
        System.out.println(myQ.isFull());

        System.out.println(myQ.dequeue());
        System.out.println(myQ.getElements().get(myQ.getRear()-1));


    }
}
