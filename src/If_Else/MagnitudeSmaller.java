package If_Else;

import java.util.Scanner;

public class MagnitudeSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > -69 && n < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is not smaller than 69");
        }
    }
}
