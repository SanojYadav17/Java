package Basics;
import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Square Number: ");

        int square =sc.nextInt();
        int number = square * square;
        System.out.println("The Square is: " + number);

    }
}
