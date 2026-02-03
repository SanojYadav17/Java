//  Relational Operators in Java: ==, !=, >, <, >=, <=

package Operators;
import java.util.Scanner;
public class Relational_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println("Is num1 equal to num2?" + (num1 == num2));

    }
}
