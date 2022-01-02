package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] a = {34,8,64,51,32,21};

        System.out.println("Unsorted                 :::: "+Arrays.toString(a));

        InsertionSort.insertionSort(a);

        System.out.println("Sorted by Insertion Sort :::: "+Arrays.toString(a));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        Integer[] b = {81,94,11,96,12,35,17,95,28,58,41,75,15};

        System.out.println("Unsorted                 :::: "+Arrays.toString(b));

        ShellSort.shellSort(b);

        System.out.println("Sorted by Shell Sort     :::: "+Arrays.toString(b));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        Integer[] c = {59,53,58,26,41,31,97};

        System.out.println("Unsorted                 :::: "+Arrays.toString(c));

        HeapSort.heapsort(c);

        System.out.println("Sorted by Heap Sort      :::: "+Arrays.toString(c));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        Integer[] d = {12,15,-23,-4,6,10,-35,28};

        System.out.println("Unsorted                 :::: "+Arrays.toString(d));

        MergeSort.mergeSort(d);

        System.out.println("Sorted by Merge Sort     :::: "+Arrays.toString(d));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        Integer[] e = {13,81,92,43,65,31,57,26,75,0};

        System.out.println("Unsorted                 :::: "+Arrays.toString(e));

        QuickSort.quickSort(e);

        System.out.println("Sorted by Quick Sort     :::: "+Arrays.toString(e));

    }
}
