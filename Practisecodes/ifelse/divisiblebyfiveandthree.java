import java.util.Scanner;

public class divisiblebyfiveandthree{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int x;
   System.out.println("enter the number : ");
   x = sc.nextInt();
   if(x%5==0 && x%3==0){  //&& operator is going to be true  when both condition is true 
    System.out.println("this num is divisible by 5 and 3 : "+x);
   }
   else{
    System.out.println("this num is not divisible by 5 and 3 : " +x);
   }
    
   sc.close();
   }

}
