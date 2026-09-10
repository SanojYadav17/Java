package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();

        int r =0;
        while(num != 0){
            r *= 10;
            r += (num % 10);
            num /= 10;
        }
        System.out.println(r);
    }
}
