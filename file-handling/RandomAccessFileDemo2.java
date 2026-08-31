import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("random_data.dat", "rw")) {
            
            // 1. Write initial data
            file.writeBytes("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            file.writeInt(2026);

            // 2. Read original string ( fixed 26 bytes )
            file.seek(0);
            byte[] bytes = new byte[26];
            file.readFully(bytes);
            System.out.println("Original String: " + new String(bytes));

            // 3. Move pointer directly to index 0 to overwrite first 3 characters
            file.seek(0);
            file.writeBytes("XYZ");

            // 4. Read modified data back
            file.seek(0);
            file.readFully(bytes);
            System.out.println("Modified String: " + new String(bytes));
            
            // 5. Read integer at exact offset (26 bytes string offset)
            file.seek(26);
            System.out.println("Read Integer: " + file.readInt());

        } catch (IOException e) {
            System.out.println("Random Access Error: " + e.getMessage());
        }
    }
}