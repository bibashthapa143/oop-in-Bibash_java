import java.util.Scanner;

public class mains{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            
            System.out.println("Enter your age: ");
            String age = sc.nextLine();
            
            System.out.println("Hello " + name);
            System.out.println("Your age is " + age);
        
    }
}