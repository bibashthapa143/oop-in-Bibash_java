import java.util.ArrayList;
/*
 * THEORY: ArrayList is a resizable-array implementation of the
 * List interface. It maintains insertion order, allows duplicates,
 * and supports random access via get(index), unlike a plain array
 * it can grow or shrink dynamically.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Write report");
        tasks.add("Attend meeting");
        tasks.add("Submit assignment");

        System.out.println("Tasks: " + tasks);
        System.out.println("Size: " + tasks.size());

        tasks.add(1, "Reply emails"); // insert at specific index
        System.out.println("After insert at index 1: " + tasks);

        tasks.remove("Attend meeting");
        System.out.println("After removing 'Attend meeting': " + tasks);

        System.out.println("Contains 'Write report': " + tasks.contains("Write report"));

        System.out.println("\nIterating with for-each:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
/*
 * SAMPLE OUTPUT
 * Tasks: [Write report, Attend meeting, Submit assignment]
 * Size: 3
 * After insert at index 1: [Write report, Reply emails, Attend meeting, Submit assignment]
 * After removing 'Attend meeting': [Write report, Reply emails, Submit assignment]
 * Contains 'Write report': true
 *
 * Iterating with for-each:
 * - Write report
 * - Reply emails
 * - Submit assignment
 */
