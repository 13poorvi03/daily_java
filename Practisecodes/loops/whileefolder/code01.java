package Practisecodes.loops.whileefolder;

import java.util.Scanner;

public class code01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      int num = 1;

      // Loop until num <= n
      while (num <= n) {
         System.out.println(num);
         num++;
      }

      sc.close();
   }
}