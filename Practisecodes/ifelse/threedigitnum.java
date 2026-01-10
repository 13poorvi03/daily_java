import java.util.Scanner;

public class threedigitnum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int x;
   System.out.println("enter the number : ");
   x = sc.nextInt();
   if(x>99 && x<999){
    System.out.println("this is the three digit number : "+x);
   }
   else{
    System.out.println("this is not a three digit number : " +x);
   }
    
   sc.close();
   }

}
