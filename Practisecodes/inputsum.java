package Practisecodes;
import java.util.Scanner;

public class inputsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int z = x + y;

        System.out.println("The sum of the two numbers is: " + z);

        sc.close(); // close scanner
    }
}