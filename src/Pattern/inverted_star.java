// Program to print inverted star pattern ----->[Method 1]

// package Pattern;

// public class inverted_star {
//     public static void main(String args[]) {
//         for (int line = 1; line <= 4; line++) {
//             for (int star = 4; star >= line; star--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

    // Program to print inverted star pattern ----->[Method 2]

package Pattern;

public class inverted_star {
    public static void main(String args[]) {
        int n = 4; // You can change this value to adjust the size of the pattern
        for (int line = 1; line <= n; line++) {
            for(int star=1; star<=(n-line+1); star++){
                System.out.print("*");  
            } System.out.println();
            }
    }
}
