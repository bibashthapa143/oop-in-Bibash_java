import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter one number: ");
        int a = sc.nextInt();
        
    if(a%2==0)
    {
        System.out.println(a +" is Even");
    }
    else
    {
        System.out.println(a +" is Odd");
    }

    System.out.println("\n");


    do{
    
        System.out.println("loop");

        a++;
      }while(a<5);



    if(a>5)
    {
        System.out.println("*" );
    }
    

    }
    
}
