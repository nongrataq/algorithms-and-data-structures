package data_structures.my_stack_realization;

public class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            throw new IllegalStateException("Stack overflow");
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}