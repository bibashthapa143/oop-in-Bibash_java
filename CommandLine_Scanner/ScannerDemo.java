import java.util.Scanner;

/*
 * ============================================================
 * THEORY: Scanner Class
 * ============================================================
 * The Scanner class (java.util.Scanner) is used to read input
 * from various sources, most commonly the keyboard (System.in).
 * It provides methods like:
 *
 *   nextInt()     - reads an int
 *   nextDouble()  - reads a double
 *   next()        - reads a single word (String, no spaces)
 *   nextLine()    - reads an entire line including spaces
 *
 * A common pitfall is mixing nextInt()/nextDouble() with
 * nextLine(): the numeric methods leave the trailing newline
 * character in the buffer, so an extra nextLine() is often
 * needed to consume it before reading a full line.
 * ============================================================
 */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);

        sc.close();
    }
}

/*
 * ============================================================
 * SAMPLE INPUT
 * ============================================================
 * Eros
 * 20
 * 3.75
 *
 * SAMPLE OUTPUT
 * ============================================================
 * Enter your name: Eros
 * Enter your age: 20
 * Enter your CGPA: 3.75
 *
 * --- Student Details ---
 * Name : Eros
 * Age  : 20
 * CGPA : 3.75
 * ============================================================
 */
