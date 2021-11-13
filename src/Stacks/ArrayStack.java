package Stacks;

import java.util.EmptyStackException;

public class ArrayStack<T> {

    // Last In First Out

    private T[] array;
    private int top; // top equals -1 for empty stacks

    public ArrayStack(int capacity){

        if (capacity <= 0){

            throw new StackException("Capacity must be positive");

        }


        array = (T[]) new Object[capacity];
        top = -1;

    }

    public boolean isEmpty(){

        return (this.top < 0);

    }

    public boolean isFull(){

        return this.top == (this.array.length - 1);

    }

    // Adds a new element to the stack
    public void push(T newValue){

        if (isFull()){

            throw new StackException("Stack is full") ;

        }

        array[++top] = newValue;


    }

    // Removes an element from the stack
    public void pop(){

        if (isEmpty()){

            throw new StackException("Stack is empty");

        }

        top--;

    }

    // Returns the top element in the stack
    public T top(){

        if (isEmpty()){

            throw  new StackException("Stack is empty");

        }

        return array[top];

    }

    public T topAndPop(){

        if (isEmpty()){

            throw new StackException("Stack is empty");

        }

        T p = array[top];
        top--;
        return p;

    }

    public void print(){

        System.out.print("[");
        for (int t=top;t>=0;t--) {

            System.out.print(array[t]);
            if (t!=0){

                System.out.print(",");

            }
        }
        System.out.print("]");
    }



}

class StackException extends RuntimeException {

    public StackException(String message){

         super(message);

    }

}