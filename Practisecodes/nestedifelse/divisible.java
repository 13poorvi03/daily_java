package Practisecodes.nestedifelse;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Nested if-else structure
        if (a % 5 == 0) {
            if (a % 3 == 0) {
                if (a % 15 == 0) {
                    System.out.println("This number is divisible by 5, 3, and 15: " + a);
                } else {
                    System.out.println("This number is divisible by 5 and 3 but not by 15: " + a);
                }
            } else {
                System.out.println("This number is divisible by 5 but not by 3: " + a);
            }
        } else {
            if (a % 3 == 0) {
                System.out.println("This number is divisible by 3 but not by 5: " + a);
            } else {
                System.out.println("This number is not divisible by 5 or 3: " + a);
            }
        }

        sc.close();
    }
}