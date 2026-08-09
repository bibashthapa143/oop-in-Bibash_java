import java.util.Scanner;
public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        circle c = new circle(radius);
        System.out.println("Circle");
        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());

        System.out.println("---------------------------------");

        System.out.println("Enter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        rectangle r = new rectangle(length, breadth);
        System.out.println("Rectangle");
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}