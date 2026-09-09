package Loops;

import java.util.Scanner;

public class CompositePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean flag = true;  // true means prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){ // 'i' to 'n' ka ek factor nikla
                flag = false;  // 1 means Composite
                break;
            }
        }
        if(num == 1) System.out.println("Neither Prime nor Composite");
        else if(!flag)System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
