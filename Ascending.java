import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        int[] s = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + " ");
        
        }

        int temp;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (s[j] > s[j + 1]) {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + " ");
        }

        sc.close();
    }
}