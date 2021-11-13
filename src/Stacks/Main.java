package Stacks;

public class Main {
    public static void main(String[] args) {

        ArrayStack<Integer> myStack = new ArrayStack<>(10);

        System.out.println("isEmpty -> "+myStack.isEmpty());

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

        myStack.print();

        System.out.println("\nisEmpty -> "+myStack.isEmpty());

        System.out.println("isFull -> " + myStack.isFull());

        System.out.println(myStack.top());

        myStack.print();

        System.out.println();

        System.out.println(myStack.topAndPop());

        myStack.print();

    }
}
