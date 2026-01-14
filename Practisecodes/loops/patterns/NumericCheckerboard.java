package Practisecodes.loops.patterns;

import java.util.Scanner;

public class NumericCheckerboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= m; j++) {
                // If sum of row+col is even → print 1, else → print 2
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}