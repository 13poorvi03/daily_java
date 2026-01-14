package Practisecodes.loops.whileefolder;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number : ");
        int n = sc.nextInt();
        int num = 1;
        int sum =0;
        while(num<=n){
            sum+=num;
            num++;
        }
          System.out.println(sum);
            sc.close();
    }

}
