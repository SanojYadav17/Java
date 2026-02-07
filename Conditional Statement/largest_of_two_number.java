// // largest of two number without user input

public class largest_of_two_number {
    public static void main (String [] args){
        int a =20;
        int b = 41;

        if (a>=b){
            System.out.println(a + " A is largest number");
        }
        else{
            System.out.println(b + " B is largest number");
        }
    }
}

// // largest of two number with user input4

import java.util.*;

public class largest_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println(a + " is the largest number");
        } else {
            System.out.println(b + " is the largest number");
        }

        sc.close();
    }
// }
