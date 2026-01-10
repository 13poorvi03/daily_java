import java.util.Scanner;

public class greatestnum{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int x;
   System.out.println("enter the x : ");
   x = sc.nextInt();
   int y;
   System.out.println("enter the y : ");
   y = sc.nextInt();
   int z;
   System.out.println("enter the z : ");
   z = sc.nextInt();

   if(x>y && x>z){
      System.out.println("x is the greatest number ");
   }
   else if(y>x && y>z){
    System.out.println("y is the greatest number");
   }
    else{
        System.out.println("z is the greatest number");
    }
    
   sc.close();
   }

}
