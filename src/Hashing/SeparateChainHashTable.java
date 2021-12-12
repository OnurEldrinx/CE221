package Hashing;

import java.util.LinkedList;
import java.util.List;

public class SeparateChainHashTable <T>{

    private static final int DEFAULT_TABLE_SIZE = 101;
    private List<T>[] chains;
    private int currentSize;

    // Constructors

    public SeparateChainHashTable() {

        this(DEFAULT_TABLE_SIZE);

    }

    /**
     * Construct the hash table.
     * @param size approximate table size.
     */
     public SeparateChainHashTable( int size ) {

         chains = new LinkedList[nextPrime(size)];

         for( int i = 0; i < chains.length; i++){

             chains[ i ] = new LinkedList<>( );

         }

     }

    /**
     * Make the hash table logically empty.
     */
     public void makeEmpty(){

         for (List<T> chain : chains) {
             chain.clear();
         }

         currentSize = 0;

     }

    /**
     * Find an item in the hash table.
     * @param x the item to search for.
     * @return true if x is found.
     */
     public boolean contains( T x ){

        List<T> whichList = chains[hash(x)];
        return whichList.contains(x);

     }

     /**
      * Insert into the hash table. If the item is
      * already present, then do nothing.
      * @param x the item to insert.
      */
     public void insert(T x){
        List<T> whichList = chains[hash(x)];

        if(!whichList.contains( x )){
            
            whichList.add(x);
            
            // Rehash;
            if( ++currentSize > chains.length){
                rehash( );
            }

        }
     }

     /**
      * Remove from the hash table.
      * @param x the item to remove.
      */
      public void remove(T x){

            List<T> whichList = chains[hash(x)];

            if(whichList.contains(x)){

                whichList.remove( x );
                currentSize--;

            }

      }


     // Section 5.5
     private void rehash() {

         List<T>[] oldChains = chains;

         // Create new double-sized, empty table
         chains = new List[nextPrime( 2 * chains.length )];

         for( int j = 0; j < chains.length; j++ ){

             chains[ j ] = new LinkedList<>( );

         }

         // Copy table over
         currentSize = 0;

         for( int i = 0; i < oldChains.length; i++){

             for(T item : oldChains[i]){

                insert(item);

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


    // Hash Function
    private int hash(T key){

        int hashValue = key.hashCode();

        hashValue = hashValue % chains.length;

        if (hashValue < 0){

            hashValue = hashValue + chains.length;

        }

        return hashValue;

    }


}
