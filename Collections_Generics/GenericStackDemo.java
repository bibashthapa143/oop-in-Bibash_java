import java.util.EmptyStackException;
/*
 * THEORY: A generic class can implement a reusable data structure
 * that works with ANY type. This program builds a simple custom
 * Stack<T> (LIFO - Last In, First Out) using generics and an
 * internal array-backed list.
 */
class MyStack<T> {
    private java.util.ArrayList<T> items = new java.util.ArrayList<>();

    void push(T item) {
        items.add(item);
    }

    T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return items.remove(items.size() - 1);
    }

    T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return items.get(items.size() - 1);
    }

    boolean isEmpty() {
        return items.isEmpty();
    }

    int size() {
        return items.size();
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack size after pops: " + stack.size());

        MyStack<String> nameStack = new MyStack<>();
        nameStack.push("A");
        nameStack.push("B");
        System.out.println("String stack pop: " + nameStack.pop());
    }
}
/*
 * SAMPLE OUTPUT
 * Stack size: 3
 * Top element (peek): 30
 * Popped: 30
 * Popped: 20
 * Stack size after pops: 1
 * String stack pop: B
 */
