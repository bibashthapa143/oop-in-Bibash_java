import java.util.TreeMap;
/*
 * THEORY: TreeMap is a Map implementation that keeps its keys in
 * sorted (natural or comparator-defined) order, backed by a
 * red-black tree, unlike HashMap which gives no ordering guarantee.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> ages = new TreeMap<>();
        ages.put("Zara", 25);
        ages.put("Amit", 30);
        ages.put("Maya", 22);
        ages.put("Bikash", 28);

        System.out.println("TreeMap (sorted by key): " + ages);
        System.out.println("First key: " + ages.firstKey());
        System.out.println("Last key: " + ages.lastKey());

        for (String name : ages.keySet()) {
            System.out.println(name + " -> " + ages.get(name));
        }
    }
}
/*
 * SAMPLE OUTPUT
 * TreeMap (sorted by key): {Amit=30, Bikash=28, Maya=22, Zara=25}
 * First key: Amit
 * Last key: Zara
 * Amit -> 30
 * Bikash -> 28
 * Maya -> 22
 * Zara -> 25
 */
