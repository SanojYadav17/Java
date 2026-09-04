package If_Else;
import java.util.Scanner;

public class SampleQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number");
        int a = sc.nextInt();

        if (a % 3 ==0 && a % 5 ==0){
            System.out.println("Sanoj");
        }else if(a % 3 ==0){
            System.out.println("Manoj");
        }else if(a % 5 ==0){
            System.out.println("PP");
        }else{
            System.out.println("Nope");
        }
    }
}
