package vn.com.huylq.datastructures.stack.array;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int removedValue = stack.pop();
        System.out.println("Value " + removedValue + " is removed from the stack");
        stack.push(5);
        System.out.println("Top of stack is " + stack.peek());
        System.out.println("Top of stack is " + stack.peek());
        stack.delete();
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Top of stack is " + stack.peek());
    }
}
