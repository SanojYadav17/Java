// package loop;

// public class continue_keyword {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 continue; // Skip the rest of the loop when i is 3
//             }
//             System.out.println(i);
//         }
//     }
// }

// Check if a number is prime or not [Method---->1]

// package loop;

// import java.util.Scanner;

// public class continue_keyword {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {
//                 System.out.println("Number is Not Prime");
//                 return;
//             }
//         }
//         System.out.println("Number is Prime");
//     }
// }


// Check if a number is prime or not [Method---->2]

// package loop;

// import java.util.Scanner;

// public class continue_keyword {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if (n == 2) {
//             System.out.println("Number is Prime");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= n - 1; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }
//             if (isPrime == true) {
//                 System.out.println("Number is Prime");
//             } else {
//                 System.out.println("Number is Not Prime");
//             }
//         }
//     }
// }

// Check if a number is prime or not [Method---->3]

package loop;

import java.util.Scanner;

public class continue_keyword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Number is Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is Not Prime");
            }
        }
    }
}