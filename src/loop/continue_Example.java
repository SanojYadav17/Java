// Display all number entered by user except multiples of 10

package loop;

import java.util.Scanner;

public class continue_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your Number:");
            int n = sc.nextInt();

            if (n % 10 == 0){
                continue;
            }
            System.out.println("Number was : " + n);
        } while (true);
    }
}