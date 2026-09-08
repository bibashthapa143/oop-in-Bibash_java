import java.io.*;

public class CopyFile {

    public static void main(String args[]) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("test.txt");
            out = new FileWriter("output.txt");

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("File copied successfully!");

        } finally {

            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
}
