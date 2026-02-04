// Example of using else if in Java without user input

// public class elseif {
//     public static void main(String[] args) {
//         int number = 15;

//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }
// }

// Example of using else if in Java with user input

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}