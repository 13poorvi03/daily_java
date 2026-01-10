import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Triangle inequality check
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Yes, these can be the sides of a triangle.");
        } else {
            System.out.println("No, these cannot form a triangle.");
        }

        sc.close();
    }
}