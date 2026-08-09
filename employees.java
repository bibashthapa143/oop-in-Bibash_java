import java.util.Scanner;
class employee{
    int empid;
    String empname;
    String empaddress;

    employee(int id, String name, String address) {
        empid = id;
        empname = name;
        empaddress = address;
    }
    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Address: " + empaddress);  
    }

}

public class employees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        employee[] employees = new employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Employee Address: ");
            String address = sc.nextLine();

            employees[i] = new employee(id, name, address);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("\nEmployee Details:");
        for (employee e : employees) {
            e.display();
            
        }
    }
}
