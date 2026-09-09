/*
 * THEORY: Command-line arguments are always passed as Strings.
 * To use them as numbers, they must be parsed using methods like
 * Integer.parseInt(). This program adds two numbers passed as
 * command-line arguments.
 */
public class CommandLineSum {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CommandLineSum <num1> <num2>");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum of " + a + " and " + b + " = " + (a + b));
    }
}
/*
 * SAMPLE OUTPUT (java CommandLineSum 15 25)
 * Sum of 15 and 25 = 40
 */
