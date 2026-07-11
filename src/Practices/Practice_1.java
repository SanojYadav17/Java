// Question1: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
package Practices;
import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

// Question 2 :Write a program to find the factorialof any number entered by the user

// import java.util.Scanner;

// public class Practice_1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if (n < 0) {
//             System.out.println("Factorial does not exist for negative numbers.");
//         } else {
//             long factorial = 1;

//             for (int i = 1; i <= n; i++) {
//                 factorial *= i;
//             }

//             System.out.println("Factorial of " + n + " is " + factorial);
//         }
//     }
// }

// Question 4: Write a program to print the multiplication table of a number N, entered by the user.

// import java.util.Scanner;

// public class Practice_1 {

//     public static void printMultiplicationTable() {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " * " + i + " = " + (n * i));
//         }

//         sc.close();
//     }
// }