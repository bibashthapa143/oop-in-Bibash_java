import java.util.ArrayList;
import java.util.Iterator;
/*
 * THEORY: An Iterator provides a standard way to traverse a
 * collection and, unlike a for-each loop, allows SAFE removal of
 * elements during traversal using iterator.remove(), avoiding a
 * ConcurrentModificationException.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        System.out.println("Original list: " + numbers);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int value = it.next();
            if (value % 2 == 0) {
                it.remove(); // safely remove even numbers while iterating
            }
        }

        System.out.println("After removing even numbers: " + numbers);
    }
}
/*
 * SAMPLE OUTPUT
 * Original list: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * After removing even numbers: [1, 3, 5, 7, 9]
 */
