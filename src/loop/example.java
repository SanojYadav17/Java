package loop;

//keep entering numbers till user enters a multiple of 10
import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    break;
                }
                System.out.println("You entered: " + n);
            } while (true);
        }
    }
}