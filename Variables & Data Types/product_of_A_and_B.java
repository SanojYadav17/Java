//  Product of two numbers using user input
import java.util.Scanner;

public class product_of_A_and_B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (A): ");
        int A = sc.nextInt();
        
        System.out.print("Enter second number (B): ");
        int B = sc.nextInt();

        int product = A * B;
        System.out.println("Product of A and B = " + product);
        sc.close();
    }
}
