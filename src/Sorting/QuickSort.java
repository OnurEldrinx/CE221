package Sorting;

public class QuickSort {

    private static final int CUTOFF = 10;

    /**
     * Quicksort algorithm.
     * @param a an array of Comparable items.
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] a){

        quicksort(a,0,a.length - 1);

    }

    /**
     2 * Internal quicksort method that makes recursive calls.
     3 * Uses median-of-three partitioning and a cutoff of 10.
     4 * @param a an array of Comparable items.
     5 * @param left the left-most index of the sub array.
     6 * @param right the right-most index of the sub array.
     7 */
    private static <T extends Comparable<? super T>> void quicksort(T[] a,int left,int right){

        if (left + CUTOFF <= right){

            T pivot = medianOf3(a,left,right);

            // Begin partitioning
            int i = left;
            int j = right-1;

            for (;;){

                while (a[++i].compareTo(pivot) < 0){ }
                while (a[--j].compareTo(pivot) > 0){ }
                if (i<j){

                    swapReferences(a,i,j);

                }else{

                    break;

                }

            }

            // Restore pivot
            swapReferences(a,i,right-1);

            // Sort group of smalls
            quicksort(a,left,i-1);

            // Sort group of larges
            quicksort(a,i+1,right);


        }else{

            InsertionSort.insertionSort(a);

        }

    }




    /**
     * @return median of left, center, and right.
     * Order these and hide the pivot.
     */
    private static <T extends Comparable<? super T>> T medianOf3(T[] a,int left,int right){

        int center = (left+right) / 2;

        if (a[center].compareTo(a[left])<0){

            swapReferences(a,left,center);

        }
        if (a[right].compareTo(a[left])<0){

            swapReferences(a,left,right);

        }
        if (a[right].compareTo(a[center])<0){

            swapReferences(a,center,right);

        }

        // Place pivot at position (right-1)
        swapReferences(a,center,right-1);

        return a[right-1];

    }



    // Explicitly implemented with speed purpose
    public static <T> void swapReferences(T[] a,int i1,int i2) {
        T temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

}
