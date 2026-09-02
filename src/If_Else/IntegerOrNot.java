package If_Else;
import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double n = sc.nextDouble();
        int a = (int) n;
        if(n - a > 0){
            System.out.println("Not an Integer");
        }
        else{
            System.out.println("Is an Integer");
        }
    }
}
