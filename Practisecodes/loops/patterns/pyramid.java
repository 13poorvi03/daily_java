package Practisecodes.loops.patterns;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop → controls the number of rows (levels of the pyramid)
        for (int i = 0; i < n; i++) {

            // First inner loop → prints spaces before stars
            // For row i, we need (n - i - 1) spaces to center the pyramid
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // two spaces for alignment
            }

            // Second inner loop → prints stars
            // For row i, we print (2 * i + 1) stars to make the pyramid shape
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }

            // Move to the next line after finishing one row
            System.out.println();
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}