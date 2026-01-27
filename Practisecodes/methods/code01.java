package Practisecodes.methods;

import java.util.Scanner;

class Algebra {
    int add(int a, int b) {
        return a + b;  // directly return without extra variable
    }
}

public class code01 {
    public static void main(String[] args) {
        Algebra s1 = new Algebra();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int ans = s1.add(x, y);
        System.out.println("Sum of input numbers is: " + ans);

        sc.close(); // close scanner
    }
}