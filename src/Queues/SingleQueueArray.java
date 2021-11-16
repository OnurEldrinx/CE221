package Queues;

import java.util.ArrayList;

public class SingleQueueArray <T>{

    private int front;
    private int rear;
    private int maxSize;            //capacity of underlying ArrayList
    private ArrayList<T> elements;  //not array

    public SingleQueueArray(){

        this(101); // Actually holds 1 less than given size

    }

    public SingleQueueArray(int maxSize){

        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.elements = new ArrayList<>(this.maxSize);


    }

    public void print(){

        System.out.print("[");
        for (T element:this.elements) {

            System.out.print(" "+element+" ");

        }
        System.out.println("]");

    }

    boolean isEmpty(){

        return (front == rear);

    }

    boolean isFull(){

        return ((rear+1) % maxSize == front);

    }


    void enqueue(T x){

        if (!isFull()){

            elements.add(x);

        }else{

            elements.set(rear,x);

        }

        rear = (rear+1) % maxSize;

    }

    T dequeue(){

        T temp = null;

        if (!isEmpty()){

            temp = elements.get(front);
            front = (front+1) % maxSize;
        }

        return temp;

    }













    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ArrayList<T> getElements() {
        return elements;
    }

    public void setElements(ArrayList<T> elements) {
        this.elements = elements;
    }




}
