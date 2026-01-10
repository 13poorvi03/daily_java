package Practisecodes.loops.forloop;



import java.util.Scanner;

public class printnnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for(int i =0; i<=a ; i++){
            System.out.println("the number : " +i);
        }

        sc.close();
    }
}