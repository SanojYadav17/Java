package If_Else;

import java.util.Scanner;

public class Positive_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("Number is Positive Integer");
        }else{
            System.out.println("Number is Negative Integer");
        }

    }

}
