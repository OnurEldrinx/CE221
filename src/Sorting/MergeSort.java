package Sorting;

public class MergeSort {

    /**
     * Internal method that makes recursive calls.
     * @param a an array of Comparable items.
     * @param tempArray an array to place the merged result.
     * @param left the left-most index of the sub array.
     * @param right the right-most index of the sub array.
     */
    private static <T extends Comparable<? super T>> void mergeSort(T[] a,T[] tempArray,int left,int right){

        if (left<right){

            int center = (left+right)/2;
            mergeSort(a,tempArray,left,center);
            mergeSort(a,tempArray,center+1,right);
            merge(a,tempArray,left,center+1,right);

        }
    }

    /**
     * Mergesort algorithm.
     * @param a an array of Comparable items.
     */
    public static <T extends Comparable<? super T>> void mergeSort(T[] a){

        T[] tempArray = (T[]) new Comparable[a.length];

        mergeSort(a,tempArray,0,a.length-1);

    }

    /**
     * Internal method that merges two sorted halves of a sub array.
     * @param a an array of Comparable items.
     * @param tempArray an array to place the merged result.
     * @param leftPosition the left-most index of the sub array.
     * @param rightPosition the index of the start of the second half.
     * @param rightEnd the right-most index of the sub array.
     */
    private static <T extends Comparable<? super T>> void merge(T[] a,T[] tempArray,int leftPosition,int rightPosition,int rightEnd){

        int leftEnd = rightPosition - 1;
        int tempPosition = leftPosition;
        int numberOfElements = rightEnd - leftPosition + 1;

        // Main Loop
        while (leftPosition<=leftEnd && rightPosition<=rightEnd){

            if (a[leftPosition].compareTo(a[rightPosition])<=0){

                tempArray[tempPosition++] = a[leftPosition++];

            }else{

                tempArray[tempPosition++] = a[rightPosition++];

            }

        }

        // Copy rest of left half
        while (leftPosition<=leftEnd){

            tempArray[tempPosition++] = a[leftPosition++];

        }

        // Copy rest of right half
        while (rightPosition<=rightEnd){

            tempArray[tempPosition++] = a[rightPosition++];

        }

        // Copy tempArray back
        for (int i=0;i<numberOfElements;i++,rightEnd--){

            a[rightEnd] = tempArray[rightEnd];

        }




    }


}
