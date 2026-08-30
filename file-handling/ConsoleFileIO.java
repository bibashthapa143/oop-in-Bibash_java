import java.io.*;

public class ConsoleFileIO {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter text to save into file: ");
            String input = reader.readLine();

            // Writing console input to file
            FileWriter writer = new FileWriter("console_output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Data successfully written to file.\n");

            // Reading from file and printing to console
            System.out.println("Reading content from console_output.txt:");
            BufferedReader fileReader = new BufferedReader(new FileReader("console_output.txt"));
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An I/O Exception occurred: " + e.getMessage());
        }
    }
}