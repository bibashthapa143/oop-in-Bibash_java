import java.util.*;

/*
 * ============================================================
 * THEORY: Generics
 * ============================================================
 * Generics allow classes, interfaces, and methods to operate on
 * a TYPE PARAMETER specified at the time of use, instead of a
 * fixed type. Benefits:
 *
 * 1. Type Safety   - errors caught at compile time instead of
 *                     ClassCastException at runtime
 * 2. Reusability   - one class/method works with many types
 * 3. Eliminates the need for explicit casting
 *
 * Syntax: class ClassName<T> { ... }   where T is a placeholder
 * for the actual type (common letters: T=Type, E=Element,
 * K=Key, V=Value)
 *
 * Bounded types (<T extends Number>) restrict T to a specific
 * type or its subclasses.
 * ============================================================
 */

// ---------- Generic class with a single type parameter ----------
class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public boolean isEmpty() {
        return content == null;
    }
}

// ---------- Generic class with two type parameters ----------
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return "(" + key + " -> " + value + ")";
    }
}

// ---------- Generic method ----------
class Utility {
    // works with any array type
    static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // bounded type parameter - only Number and its subclasses (Integer, Double...)
    static <T extends Number> double sumOfList(List<T> list) {
        double sum = 0;
        for (T num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {

        // ---------- Generic class: Box<T> ----------
        System.out.println("--- Generic Class: Box<T> ---");
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("String Box content: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer Box content: " + intBox.get());
        // No casting needed, and stringBox.set(100) would be a COMPILE-TIME error

        // ---------- Generic class: Pair<K, V> ----------
        System.out.println("\n--- Generic Class: Pair<K, V> ---");
        Pair<String, Integer> studentMarks = new Pair<>("Eros", 95);
        Pair<Integer, String> idToName = new Pair<>(101, "Anita");
        System.out.println("Pair 1: " + studentMarks);
        System.out.println("Pair 2: " + idToName);

        // ---------- Generic method ----------
        System.out.println("\n--- Generic Method: printArray() ---");
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Java", "is", "fun"};
        Utility.printArray(intArray);
        Utility.printArray(strArray);

        // ---------- Bounded type parameter ----------
        System.out.println("\n--- Bounded Generic Method: sumOfList() ---");
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println("Sum of intList    : " + Utility.sumOfList(intList));
        System.out.println("Sum of doubleList : " + Utility.sumOfList(doubleList));
    }
}

/*
 * ============================================================
 * SAMPLE OUTPUT
 * ============================================================
 * --- Generic Class: Box<T> ---
 * String Box content: Hello Generics
 * Integer Box content: 100
 *
 * --- Generic Class: Pair<K, V> ---
 * Pair 1: (Eros -> 95)
 * Pair 2: (101 -> Anita)
 *
 * --- Generic Method: printArray() ---
 * 1 2 3 4
 * Java is fun
 *
 * --- Bounded Generic Method: sumOfList() ---
 * Sum of intList    : 60.0
 * Sum of doubleList : 7.0
 * ============================================================
 */
