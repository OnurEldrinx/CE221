package Sorting;

public class HeapSort {

    /**
     * Internal method for heapsort.
     * @param i the index of an item in the heap.
     * @return the index of the left child.
     */
    private static int leftChild( int i ){
        return 2 * i + 1;
    }

    /**
     * Internal method for heapsort that is used in deleteMax and buildHeap.
     * @param a an array of Comparable items.
     * @param i the position from which to percolate down.
     * @param n the logical size of the binary heap.
     */
    private static <T extends Comparable<? super T>> void percolateDown(T[] a,int i,int n){

        int child;
        T temp;

        for (temp = a[i];leftChild(i) < n;i = child){

            child = leftChild(i);

            if (child != n-1 && a[child].compareTo(a[child+1]) < 0){

                child++;

            }
            if (temp.compareTo(a[child]) < 0){

                a[i] = a[child];

            }else {

                break;

            }

        }

        a[i] = temp;


    }

    /**
     * Standard heapsort.
     * @param a an array of Comparable items.
     */
    public static <T extends Comparable<? super T>> void heapsort(T[] a){

        //buildHeap
        for (int i=a.length/2-1;i>=0;i--){

            percolateDown(a,i,a.length);

        }

        //deleteMax
        for (int i=a.length-1;i>0;i--){

            swapReferences(a,0,i);
            percolateDown(a,0,i);

        }



    }

    public static <T> void swapReferences(T[] a,int i1,int i2) {
        T temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

}
