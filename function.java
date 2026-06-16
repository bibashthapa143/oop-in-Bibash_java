import java.util.Scanner;

public class function {
    public static void main (String[] args)
    {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        int sum = a+b;
        int sub =a-b;
        int mul = a*b;
        int div = a/b;  

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);      
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        sc.close();
        

    }
}
