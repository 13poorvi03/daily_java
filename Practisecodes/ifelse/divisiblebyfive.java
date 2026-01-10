import java.util.Scanner;

public class divisiblebyfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter a number : ");
         int x = sc.nextInt();
         if(x%5==0){
            System.out.println("this is number is divisible by 5 : " + x);
         }
         else{
            System.out.println("this number is not divisible by 5 : " + x);
         }
                 sc.close();
    }
}
