import java.util.Scanner;

public class bitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a<b && a++<c);
            System.out.println(a);
            System.out.println(a<b & a++<c);
            System.out.println(a);
    }
    
}
