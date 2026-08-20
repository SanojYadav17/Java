package Pattern;

public class character_pattern {
    public static void main(String[] args) {
    
        int n = 4;
        char ch = 'A';

        // outer loop for each line
        for (int line = 1; line <= n; line++) {
            // inner loop for printing characters in each line
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
    }
}
