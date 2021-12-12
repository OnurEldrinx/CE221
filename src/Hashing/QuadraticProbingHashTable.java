package Hashing;

import java.util.Arrays;

public class QuadraticProbingHashTable <T>{

        private static class HashEntry<T>{

            public T element;        // the element
            public boolean isActive; // false if marked deleted

            public HashEntry(T e){

                this(e,true);

            }

            public HashEntry(T e,boolean i){

                this.element = e;
                this.isActive = i;

            }

        }

        private static final int DEFAULT_TABLE_SIZE = 11;

        private HashEntry<T>[] array; // the array of elements
        private int currentSize;      // the number of occupied cells

        // Constructors

        /**
         * Construct the hash table.
         */
        public QuadraticProbingHashTable(){

            this( DEFAULT_TABLE_SIZE );

        }

        /**
         * Construct the hash table.
         * @param size the approximate initial size.
         */
        public QuadraticProbingHashTable( int size ){

            allocateArray(size);
            makeEmpty();

        }

        // HASH FUNCTION
        private int hash(T key){

            int hashVal = key.hashCode( );

            hashVal %= array.length;

            if( hashVal < 0 ) {

                hashVal += array.length;

            }
            return hashVal;
        }


        /**
         * Insert into the hash table. If the item is
         * already present, do nothing.
         * @param x the item to insert.
         */
        public void insert(T x){

            // Insert x as active
            int currentPos = findPosition(x);

            if(isActive(currentPos)){
                return;
            }

            array[currentPos] = new HashEntry<>(x,true);

            // Rehash; see Section 5.5
            if( ++currentSize > array.length / 2 ){
                rehash( );
            }

        }

        /**
         * Remove from the hash table.
         * @param x the item to remove.
         */
        public void remove(T x){

            int currentPos = findPosition(x);

            if(isActive(currentPos)){

                array[currentPos].isActive = false;

            }

        }

        /**
         * Make the hash table logically empty.
         */
        public void makeEmpty(){

            currentSize = 0;

            Arrays.fill(array,null);

        }

        /**
         * Internal method to allocate array.
         * @param arraySize the size of the array.
         */
        private void allocateArray(int arraySize)
        {

            array = new HashEntry[nextPrime(arraySize)];

        }


        /**
         * Find an item in the hash table.
         * @param x the item to search for.
         * @return the matching item.
         */
        public boolean contains(T x){

            int currentPos = findPosition(x);
            return isActive( currentPos );

        }

        /**
         * Method that performs quadratic probing resolution in half-empty table.
         * @param x the item to search for.
         * @return the position where the search terminates.
         */
        private int findPosition(T x){

            int offset = 1;
            int currentPos = hash(x);

            while(array[currentPos] != null && !array[currentPos].element.equals(x)){

                currentPos += offset; // Compute i. probe
                offset += 2;

                if( currentPos >= array.length ){

                    currentPos -= array.length;

                }

            }

            return currentPos;

        }

        /**
         * Return true if currentPos exists and is active.
         * @param currentPos the result of a call to findPos.
         * @return true if currentPos is active.
         */
        private boolean isActive(int currentPos)
        {

            return array[currentPos] != null && array[currentPos].isActive;

        }



        /**
         * Rehashing for quadratic probing hash table.
         */
        private void rehash(){

            HashEntry<T>[] oldArray = array;

            // Create a new double-sized, empty table
            allocateArray(nextPrime(2 * oldArray.length));
            currentSize = 0;

            // Copy table over
            for (HashEntry<T> e : oldArray) {

                if (e != null && e.isActive) {
                    insert(e.element);
                }

            }

        }


        private int nextPrime(int n) {

            if( n % 2 == 0 ){
                n++;
            }

            while (!isPrime(n)){
                n += 2;
            }

            return n;

        }

        private static boolean isPrime( int n ){

            if( n == 2 || n == 3 ){
                return true;
            }
            if( n == 1 || n % 2 == 0 ){
                return false;
            }
            for(int i=3; i*i<=n; i+=2){
                if( n % i == 0 ){
                    return false;
                }
            }

            return true;
        }

}
