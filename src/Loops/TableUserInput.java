package Loops;

import java.util.Scanner;

public class TableUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int i = sc.nextInt();

//  Method: 1
        for (int j = 1; j <= 10; j = j + 1) {
        System.out.print(j*i + " ");
        }

//  Method: 2
        for (int j = 1; j <= 10; j++) {
            System.out.print(j * i + " ");
        }
    }
}