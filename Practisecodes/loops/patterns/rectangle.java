package Practisecodes.loops.patterns;

import java.util.Scanner;

public class rectangle {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("enter a number : ");
         int n = sc.nextInt();

         System.out.print("enter a number : ");
         int m = sc.nextInt();
         for(int i=0; i<n; i++){   //row
            for(int j=0; j<m; j++){   //coloumn
                System.out.print(" * ");
            }
            System.out.println();
         }

         sc.close();
    }

}
