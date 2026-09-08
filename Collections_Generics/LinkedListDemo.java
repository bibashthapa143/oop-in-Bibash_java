import java.util.LinkedList;
/*
 * THEORY: LinkedList implements List using a doubly-linked-list
 * structure, offering efficient insertion/removal at both ends
 * (addFirst, addLast, removeFirst, removeLast), making it well
 * suited to use as a Deque or Queue.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("LinkedList: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.removeFirst();
        System.out.println("After removeFirst(): " + list);
    }
}
/*
 * SAMPLE OUTPUT
 * LinkedList: [5, 10, 20, 30, 40]
 * First element: 5
 * Last element: 40
 * After removeFirst(): [10, 20, 30, 40]
 */
