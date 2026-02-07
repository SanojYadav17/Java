//  Ternary operator in Java without user input

public class ternary_operator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String result = (a > b) ? "a is greater than b" : "b is greater than a";
        System.out.println(result);

    }
}


// //  Ternary operator with user input

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);
        sc.close();
    }
}
