package Loops;

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int left = 1;
        int right = n;

        for (int i = 1; i <= n; i++) {
            System.out.println(left);
            System.out.println(right);

            left++;
            right--;
        }
    }
}