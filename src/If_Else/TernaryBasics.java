package If_Else;

import java.util.Scanner;
public class TernaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();

        System.out.println((a % 2 ==0) ? "Even" : "Odd" );
    }
}