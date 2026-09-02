package If_Else;
import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int a = sc.nextInt();

        if(a % 5 ==0){
            System.out.println("Your Number is Divisible By Five");
        }
        else{
            System.out.println("Your Number is not Divisible By Five");
        }
    }
}
