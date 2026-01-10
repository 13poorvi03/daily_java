import java.util.Scanner;

public class twodigit{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int x;
   System.out.println("enter the number : ");
   x = sc.nextInt();
   if(x>9 && x<99){
    System.out.println("this is the two digit number : "+x);
   }
   else{
    System.out.println("this is not a two digit number : " +x);
   }
    
   sc.close();
   }

}
