import java.util.Scanner;
/*
 * THEORY: A simple calculator using Scanner to read two numbers
 * and an operator symbol, then perform the corresponding
 * arithmetic operation.
 */
public class ScannerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) { System.out.println("Cannot divide by zero"); return; }
                result = a / b; break;
            default:
                System.out.println("Invalid operator"); return;
        }
        System.out.println("Result: " + a + " " + op + " " + b + " = " + result);
        sc.close();
    }
}
/*
 * SAMPLE INPUT: 10 * 5
 * SAMPLE OUTPUT:
 * Enter first number: Enter operator (+,-,*,/): Enter second number: Result: 10.0 * 5.0 = 50.0
 */
