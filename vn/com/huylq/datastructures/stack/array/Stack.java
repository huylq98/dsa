package vn.com.huylq.datastructures.stack.array;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created with size: " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[++topOfStack] = value;
            System.out.println("Value " + value + " is successfully inserted");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty");
        } else {
            return arr[topOfStack--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty");
        } else {
            return arr[topOfStack];
        }
    }

    public void delete() {
        topOfStack = -1;
    }
}
