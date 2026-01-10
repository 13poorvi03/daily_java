package Practisecodes.loops.forloop;

import java.util.Scanner;

public class nineteentable {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

       for(int i= 19 ; i<=a; i++){
        if(i%19==0){
            System.out.println(i);
        }
       }

        sc.close();
    }

}
