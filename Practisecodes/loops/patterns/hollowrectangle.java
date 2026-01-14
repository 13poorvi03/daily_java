package Practisecodes.loops.patterns;

import java.util.Scanner;



public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        // Loop through rows
        for (int i = 0; i < n; i++) {
            // Loop through columns
            for (int j = 0; j < m; j++) {
                // Print border stars
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces for alignment
                }
            }
            System.out.println();
        }

        sc.close();
    }
}