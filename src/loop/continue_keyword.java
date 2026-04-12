package loop;

public class continue_keyword {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the rest of the loop when i is 3
            }
            System.out.println(i);
        }
    }
}