import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int x =sc.nextInt();
        if(x<0){
            x= x*(-1);
            System.out.println("the absolute number is : "+x);
        }
        else{
            System.out.println("the absolute value is : " +x);
        }
        sc.close();
    }
}
