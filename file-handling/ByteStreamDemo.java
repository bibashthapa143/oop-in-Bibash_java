import java.io.*;

public class ByteStreamDemo {
    public static void main(String[] args) {
        // Byte streams are ideal for handling raw binary data like images or audio
        try (FileInputStream in = new FileInputStream("source.byte");
             FileOutputStream out = new FileOutputStream("destination.byte")) {

            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
            System.out.println("File copied successfully using Byte Stream.");

        } catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }
    }
}