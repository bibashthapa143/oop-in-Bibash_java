import java.util.Scanner;

class Student{
    String name;
    int age;
    int rollno;

    Student(String name,int age,int rollno)
    {
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
}



public class project{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("How many students do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // important fix

        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();

            System.out.println("Enter roll number: ");
            int rollno = sc.nextInt();

             sc.nextLine(); // clear buffer

            students[i]= new Student(name,age,rollno);

        }

        System.out.println("\nStudent details : ");

        for (int i=0 ; i<n; i++){
            System.out.println("Name: " + students[i].name);
            System.out.println("Age: " + students[i].age);
            System.out.println("Roll number: " + students[i].rollno);
            System.out.println("-----------------------");
        }

        sc.close();

    }
}