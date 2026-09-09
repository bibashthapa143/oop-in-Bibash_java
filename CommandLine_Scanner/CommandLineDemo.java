/*
 * ============================================================
 * THEORY: Command-Line Arguments in Java
 * ============================================================
 * Command-line arguments are values passed to a Java program
 * at the time it is run, from outside the JVM. They are supplied
 * after the class name when running the program, e.g.:
 *
 *      java CommandLineDemo Hello World 2026
 *
 * These values are collected into the String[] args array of the
 * main() method. args[0] is the first argument, args[1] the
 * second, and so on. args.length gives the total count.
 * Command-line arguments are always received as Strings, so if
 * numeric values are needed they must be parsed (e.g. using
 * Integer.parseInt() or Double.parseDouble()).
 *
 * Uses: passing configuration values, file names, or numeric
 * inputs to a program without hard-coding them or asking for
 * interactive input.
 * ============================================================
 */

public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("Number of command-line arguments: " + args.length);

        if (args.length == 0) {
            System.out.println("No arguments passed. Try running:");
            System.out.println("java CommandLineDemo Ram 21 Kathmandu");
            return;
        }

        // Printing each argument with its index
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        // Example: treating arguments as name, age, city
        if (args.length >= 3) {
            String name = args[0];
            int age = Integer.parseInt(args[1]); // parsing String to int
            String city = args[2];

            System.out.println("\n--- Formatted Output ---");
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
            System.out.println("City : " + city);
        }
    }
}

/*
 * ============================================================
 * SAMPLE OUTPUT (run as: java CommandLineDemo Ram 21 Kathmandu)
 * ============================================================
 * Number of command-line arguments: 3
 * args[0] = Ram
 * args[1] = 21
 * args[2] = Kathmandu
 *
 * --- Formatted Output ---
 * Name : Ram
 * Age  : 21
 * City : Kathmandu
 * ============================================================
 */
