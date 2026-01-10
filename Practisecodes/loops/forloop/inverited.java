package Practisecodes.loops.forloop;

import java.util.Scanner;

public class inverited {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for(int i=a; i>0 ; i--){
            System.out.println("the number : " +i);
        }

        sc.close();
    }

}
