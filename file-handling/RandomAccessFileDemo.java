import java.io.*;

public class RandomAccessFileDemo {
  public static void main(String[] args) {

    try 
    {

      // create a new RandomAccessFile with filename test
      RandomAccessFile raf = new RandomAccessFile("hello.txt", "rw");
      raf.writeUTF("Hello World"); // write something in the file
      raf.seek(0); // set the file pointer at 0 position
      System.out.println("" + raf.readLine()); // print the line
      raf.seek(0); // set the file pointer at 0 position
      raf.writeUTF("This is an example \n Hello World"); // write in the file
      raf.seek(0);
      System.out.println("" + raf.readLine()); // print the line

    } catch (IOException ex) 
    {
      ex.printStackTrace();

    }

  }

}