package Loops;

import java.util.Scanner;

public class SumAndReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse =0;
        while(num != 0){
            reverse *= 10;
            reverse += (num % 10);
            num /= 10;
        }

        int sum = reverse + original;
        System.out.println("Reverse = " + reverse);
        System.out.println("Sum = " + sum);
    }
}