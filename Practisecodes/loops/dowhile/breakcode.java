package Practisecodes.loops.dowhile;
import java.util.Scanner;

public class breakcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Enter a number (-1 to stop): ");
            num = sc.nextInt();
            if(num != -1) {
                sum += num;
            }
        } while(num != -1);

        System.out.println("Sum = " + sum);
        sc.close();
    }
}