import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        String data = "Demonstrating 16-bit Unicode character stream operations.";

        // Writing using Character Stream
        try (FileWriter writer = new FileWriter("char_demo.txt")) {
            writer.write(data);
            System.out.println("Written to file via FileWriter.");
        } catch (IOException e) {
            System.out.println("Error writing: " + e.getMessage());
        }

        // Reading using Character Stream
        try (FileReader reader = new FileReader("char_demo.txt")) {
            int character;
            System.out.print("Reading from file: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
    }
}