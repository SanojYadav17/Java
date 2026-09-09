package Loops;

import java.util.Scanner;

public class SumDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
if (num<0) num = -num;
        int sum = 0;
        while(num !=0){
            sum += num % 10;
            num/=10;
        }
        System.out.println((sum > 0) ? sum : -sum);
    }
}