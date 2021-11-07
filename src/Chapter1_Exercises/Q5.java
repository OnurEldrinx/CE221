package Chapter1_Exercises;

public class Q5 {

    //  Write a recursive method that returns the number of 1’s in the binary representation
    //  of N. Use the fact that this is equal to the number of 1’s in the representation of N/2,
    //  plus 1, if N is odd.

    public static void main(String[] args) {


        int N = 3548;
        char[] binary = Integer.toBinaryString(N).toCharArray();
        int counter = 0;

        for (char c:binary) {

            if (c == '1'){

                counter++;

            }

        }

        System.out.println(Integer.toBinaryString(N));
        System.out.println("Counter of Ones : "+counter);

        char[] b = Integer.toString(findBinary(N)).toCharArray();

        counter = 0;

        for (char c:b) {

            if (c == '1'){

                counter++;

            }

        }

        System.out.println("Counter of Ones : "+counter);

    }

    public static int findBinary(int N){

        if (N == 0){

            return 0;

        }else{

            return N % 2 + 10 * findBinary(N/2);

        }




    }

}
