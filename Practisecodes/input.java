package Practisecodes;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();   // take input from user

        double pi = 3.14;
        double area = pi * r * r;

        System.out.println("The area of circle is: " + area);

        sc.close(); // good practice to close Scanner
    }
}