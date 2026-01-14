package Practisecodes.loops.dowhile;

import java.util.Scanner;

public class code01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the number : ");
       int num = sc.nextInt();
        do{
            System.out.println(num);
            num++;
        }while(num<=40);
         
        sc.close();
    }
}
