package Loops;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++ ) {
            System.out.println("Sanoj");
        }
    }
}

//output: Enter number: 4
//Sanoj
//Sanoj
//Sanoj
//Sanoj