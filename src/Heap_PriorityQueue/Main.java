package Heap_PriorityQueue;

public class Main {
    public static void main(String[] args) {

        BinaryHeap<Integer> integerBinaryHeap = new BinaryHeap<>(10);

        System.out.println("isEmpty : " + integerBinaryHeap.isEmpty());

        integerBinaryHeap.insert(13);
        integerBinaryHeap.insert(21);
        integerBinaryHeap.insert(16);
        integerBinaryHeap.insert(24);
        integerBinaryHeap.insert(31);
        integerBinaryHeap.insert(19);
        integerBinaryHeap.insert(68);
        integerBinaryHeap.insert(65);
        integerBinaryHeap.insert(26);
        integerBinaryHeap.insert(32);




        System.out.println("findMin : " + integerBinaryHeap.findMin());

        integerBinaryHeap.printAsTree();


        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------\n");

        integerBinaryHeap.insert(14);

        integerBinaryHeap.printAsTree();

        integerBinaryHeap.deleteMin();

        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------\n");

        integerBinaryHeap.printAsTree();

        Integer[] arrayA = {25, 35, 10, 15, 150, 64, 48, 105, 149, 148, 130, 22, 67, 56, 43,52,75};

        BinaryHeap<Integer> newHeap = new BinaryHeap<Integer>(arrayA);

        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------\n");


        newHeap.printAsTree();

    }
}
