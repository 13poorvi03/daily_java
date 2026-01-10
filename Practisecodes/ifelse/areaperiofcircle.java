import java.util.Scanner;

public class areaperiofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int breadth;
        System.out.println("enter the length : ");
         length = sc.nextInt();
         System.out.println("enter the breadth : ");
         breadth = sc.nextInt();
         int area = length * breadth ;
         int perimeter = 2*(length+breadth);
         
         if(area<perimeter){
            System.out.println("the perimeter is greater than area");
         }
         else{
            System.out.println("the area is greater thann perimeter : ");
         }
         sc.close();
    }
}
