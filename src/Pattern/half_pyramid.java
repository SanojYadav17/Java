package Pattern;

public class half_pyramid {
    
    public static void main(String[] args) {

        int n = 4; // You can change this value to adjust the size of the pattern
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
