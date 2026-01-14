package Practisecodes.loops.patterns;



import java.util.Scanner;

public class numberpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop → controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces to center the pyramid
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // two spaces
            }

            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Print numbers in decreasing order (to complete the pyramid row)
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}