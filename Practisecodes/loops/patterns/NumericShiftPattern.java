package Practisecodes.loops.patterns;

import java.util.Scanner;

public class NumericShiftPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Loop through rows
        for (int i = 0; i < n; i++) {
            // Loop through columns
            for (int j = 1; j <= n; j++) {
                // Formula: shift numbers by row index
                int value = (i + j);
                if (value > n) {
                    value = value - n; // wrap around
                }
                System.out.print(value);
            }
            System.out.println(" ");
        }

        sc.close();
    }
}