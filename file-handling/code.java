import java.io.*;
import java.util.Scanner;

public class code {
    public static void main(String[] args) throws Exception {

        // Create a file
        File file = new File("hello.txt");
        file.createNewFile();

        // Write into the file
        FileWriter writer = new FileWriter(file, true);
        writer.write("Thank you");
        writer.close();

        // Read the file
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}