import java.util.*;

/*
 * ============================================================
 * THEORY: Java Collection Framework
 * ============================================================
 * The Collection Framework provides a unified architecture of
 * classes/interfaces to store and manipulate groups of objects.
 * Key interfaces and implementations:
 *
 * List  (ordered, allows duplicates)
 *    - ArrayList  : resizable array, fast random access
 *    - LinkedList : doubly linked list, fast insert/delete
 *
 * Set   (no duplicates)
 *    - HashSet      : no order guaranteed, fast lookup
 *    - LinkedHashSet: maintains insertion order
 *    - TreeSet      : sorted order
 *
 * Map   (key-value pairs, keys unique)
 *    - HashMap    : no order guaranteed
 *    - TreeMap    : sorted by key
 *    - LinkedHashMap : maintains insertion order
 *
 * Queue (FIFO processing)
 *    - LinkedList, PriorityQueue
 * ============================================================
 */

public class CollectionDemo {
    public static void main(String[] args) {

        // ---------- ArrayList ----------
        System.out.println("--- ArrayList ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicates allowed
        System.out.println("Fruits: " + fruits);
        System.out.println("Element at index 1: " + fruits.get(1));
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // ---------- HashSet ----------
        System.out.println("\n--- HashSet (no duplicates) ---");
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10); // duplicate, ignored
        uniqueNumbers.add(30);
        System.out.println("Unique numbers: " + uniqueNumbers);

        // ---------- TreeSet (sorted) ----------
        System.out.println("\n--- TreeSet (sorted order) ---");
        Set<String> sortedNames = new TreeSet<>();
        sortedNames.add("Zara");
        sortedNames.add("Amit");
        sortedNames.add("Maya");
        System.out.println("Sorted names: " + sortedNames);

        // ---------- HashMap ----------
        System.out.println("\n--- HashMap (key-value pairs) ---");
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ram", 85);
        marks.put("Sita", 92);
        marks.put("Hari", 78);
        System.out.println("Marks map: " + marks);
        System.out.println("Sita's marks: " + marks.get("Sita"));

        System.out.println("Iterating using entrySet():");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }

        // ---------- LinkedList as a Queue ----------
        System.out.println("\n--- Queue (FIFO) using LinkedList ---");
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.offer("Customer1");
        ticketQueue.offer("Customer2");
        ticketQueue.offer("Customer3");
        System.out.println("Queue: " + ticketQueue);
        System.out.println("Serving: " + ticketQueue.poll());
        System.out.println("Queue after serving: " + ticketQueue);

        // ---------- Sorting a List with Collections.sort ----------
        System.out.println("\n--- Collections.sort() ---");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(45, 12, 78, 3, 90));
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Reverse sorted: " + numbers);
    }
}

/*
 * ============================================================
 * SAMPLE OUTPUT
 * ============================================================
 * --- ArrayList ---
 * Fruits: [Apple, Banana, Mango, Apple]
 * Element at index 1: Banana
 * After removing Banana: [Apple, Mango, Apple]
 *
 * --- HashSet (no duplicates) ---
 * Unique numbers: [20, 10, 30]
 *
 * --- TreeSet (sorted order) ---
 * Sorted names: [Amit, Maya, Zara]
 *
 * --- HashMap (key-value pairs) ---
 * Marks map: {Hari=78, Sita=92, Ram=85}
 * Sita's marks: 92
 * Iterating using entrySet():
 *   Hari -> 78
 *   Sita -> 92
 *   Ram -> 85
 *
 * --- Queue (FIFO) using LinkedList ---
 * Queue: [Customer1, Customer2, Customer3]
 * Serving: Customer1
 * Queue after serving: [Customer2, Customer3]
 *
 * --- Collections.sort() ---
 * Sorted list: [3, 12, 45, 78, 90]
 * Reverse sorted: [90, 78, 45, 12, 3]
 * ============================================================
 * NOTE: exact iteration order for HashSet/HashMap may vary
 * slightly by JVM version, since they are not order-guaranteed.
 * ============================================================
 */
