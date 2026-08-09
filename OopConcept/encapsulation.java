import java.util.Scanner;

class students{
    String name;
    int age;
}
public class encapsulation{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       
        System.out.print("Enter number of  students detail: ");
        int n = s.nextInt();

        //flushing
        s.nextLine();

        students a[] = new students[n];

        for(int i=1; i<=n; i++)
        {
            a[i]=new students();
            System.out.print("Enter"+ i +"name: ");
            a[i].name =s.nextLine();

            System.out.print("Enter"+i+" age: ");
            a[i].age=s.nextInt();

            s.nextLine();
            
        }

        System.out.print("-------------------------------------");
        System.out.println("Students details:");

        for(int i=0; i<n; i++)
        {
            System.out.println("Name: "+ a[i].name);
            System.out.println("Age: "+a[i].age);

        }

        s.close();
    }
}