package Loops;

import java.util.Scanner;

public class DigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) num = 9; //we can write one digit number here
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.print(count);
    }
}