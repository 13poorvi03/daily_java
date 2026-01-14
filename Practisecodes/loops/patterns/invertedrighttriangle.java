package Practisecodes.loops.patterns;

import java.util.Scanner;

public class invertedrighttriangle {
            public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("enter a number : ");
         int n = sc.nextInt();

        
         for(int i=0; i<n; i++){   //row
            for(int j=i; j<n-1; j++){   //coloumn
                System.out.print(" * ");
            }
            System.out.println();
         }

         sc.close();
    }

}
