package Practisecodes.loops.forloop;

import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Geometric Progression:");
        for (int i = 0; i < n; i++) {
            int term = (int)(a * Math.pow(r, i));
            System.out.print(term + " ");
        }

        sc.close();
    }
}