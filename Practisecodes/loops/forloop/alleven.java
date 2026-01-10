package Practisecodes.loops.forloop;

import java.util.Scanner;

public class alleven {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for(int i =0; i<=a; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
