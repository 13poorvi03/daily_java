import java.util.Scanner;

public class spcp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cp,sp;
        System.out.println(" enter a the cost price : ");
        cp = sc.nextInt();
        System.out.println(" enter a the selling price : ");
        sp = sc.nextInt();
        
        if(sp<cp){  //if selling price is greater than cost price
           int y= cp -sp;
           System.out.println("this is the losss deal : "+y);
        }

        else if(cp==sp){
            System.out.println("this is neither loss nor profit deal : ");
        }
        else{
            int z = sp-cp;
            System.out.println("this is the profit deal : " + z);
        }
        
        sc.close();
    }
}
