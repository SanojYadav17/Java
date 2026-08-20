package Basics;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Numbers: ");
        int x = sc.nextInt();
        System.out.print("Enter your Second Numbers: ");
        int y = sc.nextInt();
        System.out.print("Enter your Third Numbers: ");
        int z = sc.nextInt();
        System.out.println("Sum is: " + (x + y + z));

    }
}
