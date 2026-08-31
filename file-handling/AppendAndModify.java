import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendAndModify {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("notes.txt", "rw")) {
            
            // Write initial content
            file.writeBytes("JAVA PROGRAMMING");

            // Move pointer to the end and append text
            file.seek(file.length());
            file.writeBytes(" LAB 2026");

            // Read full content
            file.seek(0);
            byte[] buffer = new byte[(int) file.length()];
            file.readFully(buffer);
            System.out.println("Appended Text: " + new String(buffer));

            // Replace "PROGRAMMING" with "FILE STREAM" (starts at index 5)
            file.seek(5);
            file.writeBytes("FILE STREAM");

            // Read final content
            file.seek(0);
            buffer = new byte[(int) file.length()];
            file.readFully(buffer);
            System.out.println("Modified Text: " + new String(buffer));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}