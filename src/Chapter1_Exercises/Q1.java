package Chapter1_Exercises;


import java.util.Arrays;

public class Q1 {

    //  Write a program to solve the selection problem. Let k = N/2.
    //  Draw a table showing the running time of your program for various values of N.

    //  Suppose you have a group of N numbers and would like to determine the kth largest.
    //  This is known as the selection problem.

    public static void main(String[] args) {

        int[] array = {55,78,654,987,12,37,25,674,1257,8945,154,189,781,974,55,78,654,987,12,37,25,674,1257,8945,154,189,781,974};

        int N = array.length;
        final int k = N/2;

        // kth largest

        Arrays.sort(array);



        System.out.println(Arrays.toString(array));
        System.out.println(k+". Largest Element : "+array[k]);


    }





}
