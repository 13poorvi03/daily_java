package Practisecodes;

public class hierarchyofoperators {
    public static void main(String[] args) {
        int i = 2, j = 3, k, l;
        double a, b;

        k = i / j * j;   // integer division first, then multiply
        l = j / i * i;   // integer division first, then multiply
        a = (double) i / j * j; // cast to double for decimal result
        b = (double) j / i * i;

        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/// bodmas -> bractees order division multiplication add sub 