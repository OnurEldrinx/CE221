package Heap_PriorityQueue;

import java.nio.BufferUnderflowException;

public class BinaryHeap <T extends Comparable<? super T>>{

    private static final int DEFAULT_CAPACITY = 10;
    private int currentSize; // number of elements in the heap
    private T[] array;       // heap array

    public BinaryHeap(){

        this(DEFAULT_CAPACITY);

    }

    public BinaryHeap(int capacity){

        currentSize = 0;
        array = (T[]) new Comparable[capacity + 1];

    }

    /**
     * Construct the binary heap given an array of items.
     */
    public BinaryHeap(T[] items){

        currentSize = items.length;
        array = (T[]) new Comparable[(currentSize + 2) * 11 / 10];

        int i=1;

        for (T item:items){

            array[i++] = item;

        }

        buildHeap();


    }

    /** Code from https://programmerall.com/article/5333387203/
     *
     * printSpace(int n)
     * printAsTree()
     *
     */
    public void printSpace(int n) {

        //Print n spaces (here, use ‘\t’ instead)
        for (int i = 0; i < n; i++) {
            System.out.printf("%3s", "");
        }

    }

    public void printAsTree() {

        int lineNum = 1;//First traverse the first line
        int lines = (int) (Math.log(currentSize) / Math.log(2)) + 1;//lines is the number of layers of the heap
        int spaceNum = (int) (Math.pow(2, lines) - 1);
        for (int i = 1; i <= currentSize;) {

            //Because data is stored in [1...size] left and right closed intervals, data[0] does not store data

            // Each layer is to print this interval [2^(number of layers-1) ... (2^number of layers)-1].
            // If the number in the heap is not enough (2^number of layers)-1, then print to size.
            // So take min((2^number of layers)-1, size).
            for (int j = (int) Math.pow(2, lineNum - 1); j <= Math.min(currentSize, (int) Math.pow(2, lineNum) - 1); j++) {
                printSpace(spaceNum); // Print spaceNum spaces
                System.out.printf("%3s", array[j]); // Print data
                System.out.printf("%3s", ""); // The green box in the picture
                printSpace(spaceNum); // print spaceNum spaces
                i++; // Each element is printed + 1
            }
            lineNum++;
            spaceNum = spaceNum / 2;
            System.out.println();
        }

    }


    /**
     * Insert into the priority queue, maintaining heap order.
     * Duplicates are allowed.
     * @param x the item to insert.
     */
    public void insert(T x){

        if (currentSize == array.length - 1){

            enlargeArray(array.length * 2 + 1);

        }

        // Percolate Up
        int hole = ++currentSize;

        for (array[0] = x; x.compareTo(array[hole / 2]) < 0; hole/=2){

            array[hole] = array[hole/2];

        }

        array[hole] = x;


    }

    public boolean isEmpty(){

        return currentSize == 0;

    }

    public void makeEmpty(){

        currentSize = 0;

    }

    public T findMin(){

        if (isEmpty()) throw new RuntimeException("Heap is empty");

        return array[1];

    }

    /**
     * Remove the smallest item from the priority queue.
     * @return the smallest item, or throw UnderflowException, if empty.
     */
    public T deleteMin(){

        if (isEmpty()) throw new RuntimeException("Heap is empty");

        T min = findMin();
        array[1] = array[currentSize--];
        percolateDown(1);

        return min;

    }


    private void enlargeArray(int newSize) {

        T[] old = array;

        array = (T[]) new Comparable[newSize];

        for (int i=0;i<old.length;i++){

            array[i] = old[i];

        }

    }


    /**
     *  Establish heap order property from an arbitrary arrangement of items.
     *  Runs in linear time.
     */
    private void buildHeap() {

        for (int i = currentSize/2;i>0;i--){

            percolateDown(i);

        }

    }

    /**
     * Internal method to percolate down in the heap.
     * @param hole the index at which the percolate begins.
     */
    private void percolateDown(int hole) {

        int child;
        T temp = array[hole];

        for ( ; hole*2 <= currentSize; hole = child){

            child = hole*2;

            if(child != currentSize && array[child + 1].compareTo(array[child]) < 0){

                child++;

            }

            if (array[child].compareTo(temp) < 0){

                array[hole] = array[child];

            }else{

                break;

            }

        }

        array[hole] = temp;


    }


}
