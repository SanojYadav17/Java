package If_Else;
import java.util.Scanner;
public class CostAndSelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling price: ");
        double sp = sc.nextDouble();

        if(sp > cp){
            System.out.println("Profit");
        }else{
            System.out.println("Loss");
        }
    }
}
