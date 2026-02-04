import java.util.Scanner;

// If_Else Statement without user input

// public class IfElse {
    //     public static void main(String[] args) {
    //         int age = 22;
    //         if (age >= 18) {
    //             System.out.println("You are Eligible For Voting, Driving.");
    //         }
    //         else {
    //             System.out.println("You are Not Eligible For Voting, Driving.");
    //         }
    //     }	
    // }

    // If_Else Statement with user input
public class IfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are Eligible For Voting, Driving.");
        }
        else {
            System.out.println("You are Not Eligible For Voting, Driving.");
        }
    }
}