package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class LinkedListStack<T> {

    StackNode<T> top;

    public boolean isEmpty(){

        return (top == null);

    }

    public void push(T data){

        StackNode<T> newData = new StackNode<>(data);

        if (top == null){

            top = newData;

        }else{

            StackNode<T> temp = top;
            top = newData;
            newData.next = temp;

        }


    }

    public void pop(){

        if (isEmpty()){

            System.out.println("Stack is empty.");

        }

        top = top.next;

    }

    public T peek(){

        if (isEmpty()){

            System.out.println("Stack is empty.");

        }

        return top.data;


    }

    public T topAndPop(){

        if (isEmpty()){

            System.out.println("Stack is empty.");

        }

        T p = top.data;
        top = top.next;


        return p;

    }

    public void print(){

        StackNode<T> temp = top;

        while (true){

            assert temp != null;
            System.out.println("| "+temp.data+" |");

            if (temp.next != null){

                temp = temp.next;

            }else {

                break;

            }



        }
        System.out.println("-----");

    }
}

class StackNode<T>{

    T data;
    StackNode<T> next;

    StackNode(T data){

        this.data = data;
        this.next = null;

    }

}