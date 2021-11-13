package Stacks;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayStack<Integer> myStack = new ArrayStack<>(10);

        LinkedListStack<Integer> listStack = new LinkedListStack<>();

        System.out.println("isEmpty -> "+myStack.isEmpty());
        System.out.println("--------------------------------------------");
        System.out.println("isEmpty -> "+listStack.isEmpty());
        System.out.println();

        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);

        listStack.push(0);
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        listStack.push(6);
        listStack.push(7);
        listStack.push(8);
        listStack.push(9);

        myStack.print();
        System.out.println("\n--------------------------------------");
        listStack.print();
        System.out.println();

        System.out.println("\nisEmpty -> "+myStack.isEmpty());

        System.out.println("isFull -> " + myStack.isFull());

        System.out.println("--------------------------------------------");

        System.out.println("\nisEmpty -> "+listStack.isEmpty());



        System.out.println(myStack.top());

        myStack.print();

        System.out.println();

        System.out.println(myStack.topAndPop());

        myStack.print();

        System.out.println("\n-----------------------------------------------");

        System.out.println(listStack.peek());

        listStack.print();

        System.out.println(listStack.topAndPop());

        listStack.print();

    }
}
