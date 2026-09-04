package If_Else;

import java.util.Scanner;

public class LogicalOrOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a  = sc.nextInt();

        if(a % 5 == 0 || a % 3 ==0){
            System.out.println("Divisible by 5 or 3");
        }else{
            System.out.println("Not Divisible by 5 or 3");
        }
    }
}
