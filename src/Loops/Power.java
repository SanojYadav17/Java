package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        System.out.println("The power is " + power);
    }
}
