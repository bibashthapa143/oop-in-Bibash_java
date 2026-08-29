import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class TestInvalidException {

    public void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be greater than or equal to 18");
        }

        System.out.println("Valid Age");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        TestInvalidException t = new TestInvalidException();

        try {
            t.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        sc.close();
    }
}