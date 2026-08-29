public class JavaExecptionExample{
  public static void main(String[] args) {
    try {
      int data = 50 / 0; // This will throw ArithmeticException
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero: " + e.getMessage());
    } finally {
      System.out.println("Execution completed.");
    }
  }
}