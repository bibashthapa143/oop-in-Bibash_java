import java.util.HashMap;
import java.util.Map;

public class mapExample{
    public static void main(String[] args) {

        // Create map to store key-value pairs
        Map<Integer, String> m = new HashMap<>();

        // Add key-value pairs
        m.put(1, "shyam");
        m.put(2, "rita");
        m.put(3, "sita");
        m.put(4, "ram");

        // Retrieve key-value pairs
        for (Map.Entry<Integer, String> a : m.entrySet()) {
            System.out.println("key: " + a.getKey() + " value: " + a.getValue());
        }
    }
}
