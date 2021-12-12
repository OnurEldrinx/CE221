package Hashing;

public class HashFunctions {


    /**
     * A good hash function for string objects
     * A hash routine for String objects.
     * @param key the String to hash.
     * @param tableSize the size of the hash table.
     * @return the hash value.
     */
     public static int hash1(String key,int tableSize){

         int hashValue = 0;

         for (int i = 0;i < key.length();i++){

             hashValue = 37 * hashValue + key.charAt(i);

         }

         hashValue = hashValue % tableSize;

         if (hashValue < 0){

             hashValue = hashValue + tableSize;

         }

         return hashValue;

     }

    /**
     * A simple hash function
     * @param key the String to hash.
     * @param tableSize the size of the hash table.
     * @return the hash value.
     */
     public static int hash2(String key,int tableSize){

        int hashValue = 0;

        for (int i=0;i<key.length();i++){

            hashValue = hashValue + key.charAt(i);

        }

        return hashValue % tableSize;

     }

}
